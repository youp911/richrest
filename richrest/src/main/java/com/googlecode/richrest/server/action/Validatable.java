package com.googlecode.richrest.server.action;

import com.googlecode.richrest.util.validator.Validator;

/**
 * 自验证Action
 * @author <a href="mailto:liangfei0201@gmail.com">liangfei</a>
 * @param <M> 传入模型类型
 * @param <R> 返回值类型
 */
public interface Validatable {

	/**
	 * 获取验证器
	 * @return 验证器
	 */
	Validator getValidator();

}
