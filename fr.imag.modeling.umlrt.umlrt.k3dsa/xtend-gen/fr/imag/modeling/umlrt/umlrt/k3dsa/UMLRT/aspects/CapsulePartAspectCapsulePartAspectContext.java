package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.CapsulePart;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsulePartAspectCapsulePartAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class CapsulePartAspectCapsulePartAspectContext {
  public final static CapsulePartAspectCapsulePartAspectContext INSTANCE = new CapsulePartAspectCapsulePartAspectContext();
  
  public static CapsulePartAspectCapsulePartAspectProperties getSelf(final CapsulePart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsulePartAspectCapsulePartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CapsulePart, CapsulePartAspectCapsulePartAspectProperties> map = new java.util.WeakHashMap<UMLRT.CapsulePart, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.CapsulePartAspectCapsulePartAspectProperties>();
  
  public Map<CapsulePart, CapsulePartAspectCapsulePartAspectProperties> getMap() {
    return map;
  }
}
