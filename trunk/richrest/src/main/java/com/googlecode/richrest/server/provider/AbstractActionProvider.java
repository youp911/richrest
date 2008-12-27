package com.googlecode.richrest.server.provider;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import com.googlecode.richrest.Action;
import com.googlecode.richrest.server.ActionInterceptor;
import com.googlecode.richrest.server.ActionProvider;
import com.googlecode.richrest.server.ActionServletContext;
import com.googlecode.richrest.server.util.ActionMethodUtils;
import com.googlecode.richrest.util.logger.Logger;
import com.googlecode.richrest.util.logger.LoggerFactory;

public abstract class AbstractActionProvider implements ActionProvider {

	/**
	 * 日志输出接口
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public AbstractActionProvider() {
		init(ActionServletContext.getContext().getServletContext(), ActionServletContext.getContext().getServletConfig());
	}

	protected abstract void init(ServletContext servletContext, ServletConfig servletConfig);

	public Action<Serializable, Serializable> getAction(String actionName) {
		Action<Serializable, Serializable> action = null;
		if (actionName != null) {
			try {
				action = findAction(actionName);
			} catch (Exception e) {
				// ignore
			}
		}
		if (action == null) { // 处理方法分派
			try {
				action = findAction(ActionMethodUtils.getActionName(actionName));
			} catch (Exception e) {
				// ignore
			}
		}
		return action;
	}

	public List<ActionInterceptor> getActionInterceptors() {
		try {
			return Collections.unmodifiableList(findActionInterceptors());
		} catch (Exception e) {
			return null;
		}
	}

	protected abstract Action<Serializable, Serializable> findAction(String actionName) throws Exception;

	protected abstract List<ActionInterceptor> findActionInterceptors() throws Exception;
}
