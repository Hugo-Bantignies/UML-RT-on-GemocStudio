package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import UMLRT.Model
import UMLRT.Capsule
import UMLRT.CapsulePart
import UMLRT.Port
import UMLRT.Connector
import UMLRT.Protocol
import UMLRT.Message
import UMLRT.StateMachine
import UMLRT.State
import UMLRT.Transition
import UMLRT.PseudoState
import UMLRT.Region
import UMLRT.Vertex

import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsulePartAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PortAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ConnectorAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ProtocolAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.MessageAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.TransitionAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PseudoStateAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.RegionAspect.*
import static extension fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import UMLRT.UMLRTFactory

@Aspect(className=Model)
class ModelAspect {
	
	//public Capsule activeCapsule
	//public Message inputMessage
	
	@Step 
	@InitializeModel
	/*Set the activeCapsule */
	def void initializeModel(EList<String> args){
		println("-----MODEL-----")
		println("Intialization of the Model")
		_self.activeCapsule = _self.getTop();
		_self.inputMessage = UMLRTFactory.eINSTANCE.createMessage
		_self.inputMessage.setContent(args.get(0))
	}
	
	@Step
	@Main
	/*Starting method (start with the activeCapsule) */
	def void main()
	{
		println("------STATE MACHINE------")
		_self.activeCapsule.startsm(_self.inputMessage)
	}
	

}

@Aspect(className=Capsule)
class CapsuleAspect {
	@Step
	def void startsm(Message inputMessage)
	{
		_self.getStatemachine().start(inputMessage)
	}
}

@Aspect(className=CapsulePart)
class CapsulePartAspect {

}

@Aspect(className=Port)
class PortAspect {

}

@Aspect(className=Connector)
class ConnectorAspect {

}

@Aspect(className=Protocol)
class ProtocolAspect {

}

@Aspect(className=Message)
class MessageAspect {

}

@Aspect(className=StateMachine)
class StateMachineAspect {
	
	@Step
	/*Start the machine, from the initial state (first current) */
	def void start(Message inputMessage)
	{
		_self.initStateMachine()
		println("Starting of the state machine !")
		while (! inputMessage.getContent().isEmpty) {
    			_self.currentState.step(inputMessage)
    		}  
    	println("-----END-----")  
	}
	
	@Step
	/*Search the initial state (PseudoState of kind : 'Initial') */
	def void initStateMachine()
	{
		var EList<Vertex> states = _self.getRegion().getState()
		var int i
		for(i=0;i<states.size();i++)
		{
			//Comparison with the type to know if it is a PseudoState
			if(states.get(i) instanceof PseudoState)
			{
				_self.currentState = states.get(i)
				print("Current state : ")
				println((_self.currentState as PseudoState).getName())
			}
		}
	}

}

@Aspect(className=State)
class StateAspect extends VertexAspect {

}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def void fire()
	{
		println("-----TRANSITION-----")
		//Set the currentState to the next state
		_self.getSource().getOwningsm().currentState = _self.getDestination()
		//Notif
		println("transition : "+_self.getName())
	}
}

@Aspect(className=PseudoState)
class PseudoStateAspect extends VertexAspect {

}

@Aspect(className=Region)
class RegionAspect {

}

@Aspect(className=Vertex)
class VertexAspect {
	@Step
	def void step(Message inputMessage)
	{
		println("-----STATE : STEP-----")
		
		val String message = inputMessage.getContent()
		println("input : " + message)
		// Elicitation of the valid transitions	
		val validTransitions =  _self.getOuttrans.filter[t | t.getTrigger().charAt(0) == message.charAt(0)]
		
		if(validTransitions.empty) {
			throw new Exception("[ERROR FROM MODEL] No valid transition : rejected !")
		}
		if(validTransitions.size > 1) {
			throw new Exception("[ERROR FROM MODEL] Non Determinism, not accepted !")
			
		}
		//Consume the trigger
		inputMessage.setContent(inputMessage.getContent().substring(1))
		// Fire transition
		validTransitions.get(0).fire()
	}

}



