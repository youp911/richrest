package com.googlecode.richrest.server.mapper;

import javax.servlet.http.HttpServletRequest;

import com.googlecode.richrest.server.ServletSerializer;
import com.googlecode.richrest.server.serializer.PathServletSerializer;

public class RestfulActionMapper extends DefaultActionMapper {

	@Override
	public ServletSerializer getSerializer(HttpServletRequest request) {
		ServletSerializer serializer = super.getSerializer(request);
		if (serializer == null)
			return null;
		return new PathServletSerializer(serializer);
	}

}
