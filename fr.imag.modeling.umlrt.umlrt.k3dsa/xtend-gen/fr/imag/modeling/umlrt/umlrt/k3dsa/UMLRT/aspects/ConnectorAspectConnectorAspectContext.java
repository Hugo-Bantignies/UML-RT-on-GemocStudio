package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Connector;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ConnectorAspectConnectorAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConnectorAspectConnectorAspectContext {
  public final static ConnectorAspectConnectorAspectContext INSTANCE = new ConnectorAspectConnectorAspectContext();
  
  public static ConnectorAspectConnectorAspectProperties getSelf(final Connector _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ConnectorAspectConnectorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connector, ConnectorAspectConnectorAspectProperties> map = new java.util.WeakHashMap<UMLRT.Connector, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.ConnectorAspectConnectorAspectProperties>();
  
  public Map<Connector, ConnectorAspectConnectorAspectProperties> getMap() {
    return map;
  }
}
