package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Message;
import UMLRT.PseudoState;
import UMLRT.StateMachine;
import UMLRT.Vertex;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspectStateMachineAspectProperties;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Step
  public static void start(final StateMachine _self, final Message inputMessage) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspectStateMachineAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start(Message)
    if (_self instanceof UMLRT.StateMachine){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspect._privk3_start(_self_, (UMLRT.StateMachine)_self,inputMessage);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {inputMessage}, command, "StateMachine", "start");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void initStateMachine(final StateMachine _self) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspectStateMachineAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initStateMachine()
    if (_self instanceof UMLRT.StateMachine){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspect._privk3_initStateMachine(_self_, (UMLRT.StateMachine)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "StateMachine", "initStateMachine");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_start(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Message inputMessage) {
    StateMachineAspect.initStateMachine(_self);
    InputOutput.<String>println("Starting of the state machine !");
    while ((!inputMessage.getContent().isEmpty())) {
      VertexAspect.step(_self.getCurrentState(), inputMessage);
    }
    InputOutput.<String>println("-----END-----");
  }
  
  protected static void _privk3_initStateMachine(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    EList<Vertex> states = _self.getRegion().getState();
    int i = 0;
    for (i = 0; (i < states.size()); i++) {
      Vertex _get = states.get(i);
      if ((_get instanceof PseudoState)) {
        _self.setCurrentState(states.get(i));
        InputOutput.<String>print("Current state : ");
        Vertex _currentState = _self.getCurrentState();
        InputOutput.<String>println(((PseudoState) _currentState).getName());
      }
    }
  }
}
