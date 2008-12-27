package com.googlecode.richrest.util.logger;

public class NoneLoggerProvider implements LoggerProvider {

	public Logger getLogger(String key) {
		return NoneLogger.getInstance();
	}

}
