package com.googlecode.richrest.util.serialize;

import com.googlecode.richrest.util.serializer.stream.StreamSerializer;
import com.googlecode.richrest.util.serializer.stream.XmlStreamSerializer;

public class XmlSerializerTestCase extends SerializerTestCase {

	protected StreamSerializer createSerializer() {
		return new XmlStreamSerializer();
	}

}
