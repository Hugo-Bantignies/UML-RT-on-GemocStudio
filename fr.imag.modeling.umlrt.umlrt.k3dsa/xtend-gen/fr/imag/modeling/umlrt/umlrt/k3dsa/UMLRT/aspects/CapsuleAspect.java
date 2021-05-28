package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Capsule;
import UMLRT.Message;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspectCapsuleAspectProperties;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.StateMachineAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = Capsule.class)
@SuppressWarnings("all")
public class CapsuleAspect {
  @Step
  public static void startsm(final Capsule _self, final Message inputMessage) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspectCapsuleAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspectCapsuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void startsm(Message)
    if (_self instanceof UMLRT.Capsule){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspect._privk3_startsm(_self_, (UMLRT.Capsule)_self,inputMessage);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {inputMessage}, command, "Capsule", "startsm");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_startsm(final CapsuleAspectCapsuleAspectProperties _self_, final Capsule _self, final Message inputMessage) {
    StateMachineAspect.start(_self.getStatemachine(), inputMessage);
  }
}
