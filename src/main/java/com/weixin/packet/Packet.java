package com.weixin.packet;

/**
 * @Author ligeng
 * @Date 19/7/15
 * @Time 上午2:04
 */
public abstract class Packet {
    /**
     * 协议版本
     */
    public Byte version = 1;

    /**
     * 指令
     * @return
     */
    public abstract Byte getCommand();
}



