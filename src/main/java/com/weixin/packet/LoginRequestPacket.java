package com.weixin.packet;

/**
 * @Author ligeng
 * @Date 19/7/17
 * @Time 下午5:19
 */
public class LoginRequestPacket extends Packet{

    public Integer userId;

    public String username;

    public String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}
