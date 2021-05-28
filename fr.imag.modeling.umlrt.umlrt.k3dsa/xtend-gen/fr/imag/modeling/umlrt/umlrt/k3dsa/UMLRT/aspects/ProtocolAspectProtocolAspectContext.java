package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Protocol;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ProtocolAspectProtocolAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ProtocolAspectProtocolAspectContext {
  public final static ProtocolAspectProtocolAspectContext INSTANCE = new ProtocolAspectProtocolAspectContext();
  
  public static ProtocolAspectProtocolAspectProperties getSelf(final Protocol _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ProtocolAspectProtocolAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Protocol, ProtocolAspectProtocolAspectProperties> map = new java.util.WeakHashMap<UMLRT.Protocol, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ProtocolAspectProtocolAspectProperties>();
  
  public Map<Protocol, ProtocolAspectProtocolAspectProperties> getMap() {
    return map;
  }
}
