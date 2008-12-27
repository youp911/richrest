package com.googlecode.richrest.client.event;

public interface Listenable {

	void addListener(Listener listener);

	void removeListener(Listener listener);

}
