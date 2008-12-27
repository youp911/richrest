package com.googlecode.richrest.util.serialize;

import com.googlecode.richrest.util.serializer.stream.JbossStreamSerializer;
import com.googlecode.richrest.util.serializer.stream.StreamSerializer;

public class JBossSerializerTestCase extends SerializerTestCase {

	protected StreamSerializer createSerializer() {
		return new JbossStreamSerializer();
	}

}
