package tools;

import java.util.LinkedList;

public class EventBus {

	static LinkedList<CustomListener> listListener = new LinkedList<>();

	public static void send(CustomEvent e, Object... args) {
		for (CustomListener listener : listListener) {
			listener.listen(e,args);
		}
	}

	public static void register(CustomListener l) {
		listListener.add(l);
	}

	public static void unregister(CustomListener l) {
		listListener.remove(l);
	}

}
