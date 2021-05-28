package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.StateMachine;
import UMLRT.Transition;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.TransitionAspectTransitionAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.TransitionAspectTransitionAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.TransitionAspectTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fire()
    if (_self instanceof UMLRT.Transition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.TransitionAspect._privk3_fire(_self_, (UMLRT.Transition)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Transition", "fire");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    InputOutput.<String>println("-----TRANSITION-----");
    StateMachine _owningsm = _self.getSource().getOwningsm();
    _owningsm.setCurrentState(_self.getDestination());
    String _name = _self.getName();
    String _plus = ("transition : " + _name);
    InputOutput.<String>println(_plus);
  }
}
