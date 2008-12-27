package com.googlecode.richrest.server.serializer;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;

import com.googlecode.richrest.util.JsonUtils;

public class JsonServletSerializer extends FormServletSerializer {

	public String getContentType() {
		return "text/html";
	}

	public void serialize(Serializable obj, HttpServletResponse response)
			throws IOException {
		String json = JsonUtils.toJson(obj);
		response.getWriter().write(json);
		response.getWriter().flush();
	}

}
