package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Vertex;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspectVertexAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class VertexAspectVertexAspectContext {
  public final static VertexAspectVertexAspectContext INSTANCE = new VertexAspectVertexAspectContext();
  
  public static VertexAspectVertexAspectProperties getSelf(final Vertex _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspectVertexAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Vertex, VertexAspectVertexAspectProperties> map = new java.util.WeakHashMap<UMLRT.Vertex, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.VertexAspectVertexAspectProperties>();
  
  public Map<Vertex, VertexAspectVertexAspectProperties> getMap() {
    return map;
  }
}
