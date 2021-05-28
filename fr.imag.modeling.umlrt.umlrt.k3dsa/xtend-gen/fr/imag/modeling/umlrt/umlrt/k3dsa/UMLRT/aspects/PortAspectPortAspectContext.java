package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Port;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PortAspectPortAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PortAspectPortAspectContext {
  public final static PortAspectPortAspectContext INSTANCE = new PortAspectPortAspectContext();
  
  public static PortAspectPortAspectProperties getSelf(final Port _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PortAspectPortAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Port, PortAspectPortAspectProperties> map = new java.util.WeakHashMap<UMLRT.Port, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.PortAspectPortAspectProperties>();
  
  public Map<Port, PortAspectPortAspectProperties> getMap() {
    return map;
  }
}
