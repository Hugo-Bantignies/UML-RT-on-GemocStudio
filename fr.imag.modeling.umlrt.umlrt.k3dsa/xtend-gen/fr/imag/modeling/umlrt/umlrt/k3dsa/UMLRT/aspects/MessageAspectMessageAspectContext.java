package fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects;

import UMLRT.Message;
import fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.MessageAspectMessageAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MessageAspectMessageAspectContext {
  public final static MessageAspectMessageAspectContext INSTANCE = new MessageAspectMessageAspectContext();
  
  public static MessageAspectMessageAspectProperties getSelf(final Message _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.MessageAspectMessageAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Message, MessageAspectMessageAspectProperties> map = new java.util.WeakHashMap<UMLRT.Message, fr.imag.modeling.umlrt.umlrt.k3dsa.UMLRT.aspects.MessageAspectMessageAspectProperties>();
  
  public Map<Message, MessageAspectMessageAspectProperties> getMap() {
    return map;
  }
}
