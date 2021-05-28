package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Model;
import UMLRT.UMLRTFactory;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspect;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Model.class)
@SuppressWarnings("all")
public class ModelAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final Model _self, final EList<String> args) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof UMLRT.Model){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspect._privk3_initializeModel(_self_, (UMLRT.Model)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "Model", "initializeModel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  @Main
  public static void main(final Model _self) {
    final fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectProperties _self_ = fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof UMLRT.Model){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspect._privk3_main(_self_, (UMLRT.Model)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Model", "main");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_initializeModel(final ModelAspectModelAspectProperties _self_, final Model _self, final EList<String> args) {
    InputOutput.<String>println("-----MODEL-----");
    InputOutput.<String>println("Intialization of the Model");
    _self.setActiveCapsule(_self.getTop());
    _self.setInputMessage(UMLRTFactory.eINSTANCE.createMessage());
    _self.getInputMessage().setContent(args.get(0));
  }
  
  protected static void _privk3_main(final ModelAspectModelAspectProperties _self_, final Model _self) {
    InputOutput.<String>println("------STATE MACHINE------");
    CapsuleAspect.startsm(_self.getActiveCapsule(), _self.getInputMessage());
  }
}
