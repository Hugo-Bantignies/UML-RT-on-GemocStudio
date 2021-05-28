package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Region;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.RegionAspectRegionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RegionAspectRegionAspectContext {
  public final static RegionAspectRegionAspectContext INSTANCE = new RegionAspectRegionAspectContext();
  
  public static RegionAspectRegionAspectProperties getSelf(final Region _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.RegionAspectRegionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Region, RegionAspectRegionAspectProperties> map = new java.util.WeakHashMap<UMLRT.Region, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.RegionAspectRegionAspectProperties>();
  
  public Map<Region, RegionAspectRegionAspectProperties> getMap() {
    return map;
  }
}
