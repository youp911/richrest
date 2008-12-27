package com.googlecode.richrest.server;

import java.io.Serializable;
import java.util.List;

import com.googlecode.richrest.Action;

/**
 * Action工厂SPI接口
 * @author <a href="mailto:liangfei0201@gmail.com">liangfei</a>
 */
public interface ActionProvider {

	/**
	 * 获取Action实例
	 * @param actionName Action名称
	 * @return Action实例
	 */
	Action<Serializable, Serializable> getAction(String actionName);

	/**
	 * 获取Action拦截器集合
	 * @return Action拦截器集合
	 */
	List<ActionInterceptor> getActionInterceptors();

	/**
	 * 获取异常处理器
	 * @param exceptionClass 异常类型
	 * @return 异常处理器
	 */
	ExceptionHandler getExceptionHandler(Class<? extends Throwable> exceptionClass);

}
