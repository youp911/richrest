package com.googlecode.richrest.client.event;

public class PropertyPublisher extends Publisher<PropertyListener, PropertyEvent> {

	@Override
	protected void doEvent(PropertyListener listener, PropertyEvent event) {
		listener.onPropertyChanged(event);
	}

}
