package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Message;
import UMLRT.Transition;
import UMLRT.Vertex;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.TransitionAspect;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspectVertexAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = Vertex.class)
@SuppressWarnings("all")
public class VertexAspect {
  @Step
  public static void step(final Vertex _self, final Message inputMessage) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspectVertexAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspectVertexAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void step(Message)
    if (_self instanceof UMLRT.Vertex){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspect._privk3_step(_self_, (UMLRT.Vertex)_self,inputMessage);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {inputMessage}, command, "Vertex", "step");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_step(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Message inputMessage) {
    try {
      InputOutput.<String>println("-----STATE : STEP-----");
      final String message = inputMessage.getContent();
      InputOutput.<String>println(("input : " + message));
      final Function1<Transition, Boolean> _function = (Transition t) -> {
        char _charAt = t.getTrigger().charAt(0);
        char _charAt_1 = message.charAt(0);
        return Boolean.valueOf((_charAt == _charAt_1));
      };
      final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(_self.getOuttrans(), _function);
      boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
      if (_isEmpty) {
        throw new Exception("[ERROR FROM MODEL] No valid transition : rejected !");
      }
      int _size = IterableExtensions.size(validTransitions);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new Exception("[ERROR FROM MODEL] Non Determinism, not accepted !");
      }
      inputMessage.setContent(inputMessage.getContent().substring(1));
      TransitionAspect.fire(((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0]);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
