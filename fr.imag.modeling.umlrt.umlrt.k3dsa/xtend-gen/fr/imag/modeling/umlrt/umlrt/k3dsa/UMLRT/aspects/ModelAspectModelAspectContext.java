package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Model;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ModelAspectModelAspectContext {
  public final static ModelAspectModelAspectContext INSTANCE = new ModelAspectModelAspectContext();
  
  public static ModelAspectModelAspectProperties getSelf(final Model _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Model, ModelAspectModelAspectProperties> map = new java.util.WeakHashMap<UMLRT.Model, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ModelAspectModelAspectProperties>();
  
  public Map<Model, ModelAspectModelAspectProperties> getMap() {
    return map;
  }
}
