package com.weixin.serializer;

/**
 * @Author ligeng
 * @Date 19/7/17
 * @Time 下午5:50
 */
public class JsonSerializer implements Serializer{
    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON;
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return null;
    }
}
