package client;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

/**
 * Created by Li on 2018/4/7.
 */

/**
 * Mina框架中消息处理的Handler
 * @author CJT
 *
 */
public class MinaClinetHandler extends IoHandlerAdapter {

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        System.out.println("MinaClientHandler--- exceptionCaught");
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        System.out.println("MinaClientHandler--- leeTest messageReceived"+message.toString());

        // 向客户端回复消息
        // session.write("server replay--"+message);
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        System.out.println("MinaClientHandler---messageSent:"+message.toString());
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        System.out.println("MinaClientHandler---sessionClosed");
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        System.out.println("MinaClientHandler---sessionCreated");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        System.out.println("MinaClientHandler---sessionIdle");
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        System.out.println("MinaClientHandler---sessionOpened");
    }

}