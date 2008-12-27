package com.googlecode.richrest.util.serialize;

import com.googlecode.richrest.util.serializer.stream.StreamSerializer;
import com.googlecode.richrest.util.serializer.stream.XstreamStreamSerializer;

public class XStreamSerializerTestCase extends SerializerTestCase {

	protected StreamSerializer createSerializer() {
		return new XstreamStreamSerializer();
	}

}
