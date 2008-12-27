package com.googlecode.richrest.util.serialize;

import com.googlecode.richrest.util.serializer.stream.JavaStreamSerializer;
import com.googlecode.richrest.util.serializer.stream.StreamSerializer;

public class JavaSerializerTestCase extends SerializerTestCase {

	protected StreamSerializer createSerializer() {
		return new JavaStreamSerializer();
	}

}
