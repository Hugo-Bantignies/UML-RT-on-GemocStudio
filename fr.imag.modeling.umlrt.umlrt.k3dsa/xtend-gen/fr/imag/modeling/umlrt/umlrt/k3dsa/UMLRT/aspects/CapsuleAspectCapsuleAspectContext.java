package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Capsule;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspectCapsuleAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CapsuleAspectCapsuleAspectContext {
  public final static CapsuleAspectCapsuleAspectContext INSTANCE = new CapsuleAspectCapsuleAspectContext();
  
  public static CapsuleAspectCapsuleAspectProperties getSelf(final Capsule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspectCapsuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Capsule, CapsuleAspectCapsuleAspectProperties> map = new java.util.WeakHashMap<UMLRT.Capsule, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsuleAspectCapsuleAspectProperties>();
  
  public Map<Capsule, CapsuleAspectCapsuleAspectProperties> getMap() {
    return map;
  }
}
