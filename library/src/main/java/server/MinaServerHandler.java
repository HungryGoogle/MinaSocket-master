package server;

/**
 * Created by Li on 2018/4/7.
 */

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

/**
 * Mina框架中消息处理的Handler
 * @author CJT
 *
 */
public class MinaServerHandler extends IoHandlerAdapter {

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        System.out.println("MinaServerHandler---exceptionCaught");
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        System.out.println("MinaServerHandler---messageReceived"+message.toString());

        // 向客户端回复消息
        session.write("MinaServerHandler--- send_to_client : "+message);
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        System.out.println("MinaServerHandler---messageSent:"+message.toString());
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        System.out.println("MinaServerHandler---sessionClosed");
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        System.out.println("MinaServerHandler---sessionCreated");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        System.out.println("MinaServerHandler---sessionIdle");
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        System.out.println("MinaServerHandler---sessionOpened");
    }

}