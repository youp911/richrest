package com.googlecode.richrest.client.event;

public interface ExceptionListener extends Listener {

	void onForeCatched(ExceptionEvent event);

	void onBackCatched(ExceptionEvent event);

}
