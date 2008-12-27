package com.googlecode.richrest.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.richrest.util.serializer.Serializer;

/**
 * Servlet序列化接口
 * @author <a href="mailto:liangfei0201@gmail.com">liangfei</a>
 */
public interface ServletSerializer extends Serializer<HttpServletRequest, HttpServletResponse> {

}
