package com.cc.redis;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisObjectSerializer implements RedisSerializer<Object> {

    private final Converter<Object, byte[]> serializer   = new SerializingConverter();
    private final Converter<byte[], Object> deserializer = new DeserializingConverter();

    static final byte[]               EMPTY_ARRAY  = new byte[0];

    @Override
    public Object deserialize(final byte[] bytes) {
        if (this.isEmpty(bytes))
            return null;

        try {
            return this.deserializer.convert(bytes);
        } catch (final Exception ex) {
            throw new SerializationException("Cannot deserialize", ex);
        }
    }

    @Override
    public byte[] serialize(final Object object) {
        if (object == null)
            return EMPTY_ARRAY;

        try {
            return this.serializer.convert(object);
        } catch (final Exception ex) {
            return EMPTY_ARRAY;
        }
    }

    private boolean isEmpty(final byte[] data) {
        return (data == null || data.length == 0);
    }
}
