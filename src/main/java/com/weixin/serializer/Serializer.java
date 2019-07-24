package com.weixin.serializer;

/**
 * @Author ligeng
 * @Date 19/7/17
 * @Time 下午5:20
 */
public interface Serializer {
    /**
     * 序列化算法
     * @return
     */
    byte getSerializerAlgorithm();

    /**
     * java 对象转换成二进制
     * @param object
     * @return
     */
    byte[] serialize(Object object);

    /**
     * 二进制转换成 java 对象
     * @param bytes
     * @param clazz
     * @return
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);
}
