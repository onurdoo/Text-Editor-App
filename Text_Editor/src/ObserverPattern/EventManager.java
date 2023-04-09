package ObserverPattern;

import java.io.IOException;
import java.util.HashMap;

public class EventManager {
    private HashMap<String, EventListener> listeners;

    public EventManager() {
        listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.remove(eventType, listener);
    }

    public void notify(String eventType, String data) throws IOException {
        EventListener listener = listeners.get(eventType);
        if (listener != null) {
            listener.update(data);
        }
    }
}
