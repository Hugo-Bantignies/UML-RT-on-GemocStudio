package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.PseudoState;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PseudoStateAspectPseudoStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PseudoStateAspectPseudoStateAspectContext {
  public final static PseudoStateAspectPseudoStateAspectContext INSTANCE = new PseudoStateAspectPseudoStateAspectContext();
  
  public static PseudoStateAspectPseudoStateAspectProperties getSelf(final PseudoState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PseudoStateAspectPseudoStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PseudoState, PseudoStateAspectPseudoStateAspectProperties> map = new java.util.WeakHashMap<UMLRT.PseudoState, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PseudoStateAspectPseudoStateAspectProperties>();
  
  public Map<PseudoState, PseudoStateAspectPseudoStateAspectProperties> getMap() {
    return map;
  }
}
