package com.googlecode.richrest.util.logger;

public class JdkLoggerProvider implements LoggerProvider {

	public Logger getLogger(String key) {
		return new JdkLogger(java.util.logging.Logger.getLogger(key));
	}

}
