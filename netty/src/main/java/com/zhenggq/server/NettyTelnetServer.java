package com.zhenggq.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class NettyTelnetServer {
	private static final int port = 2333;
	private ServerBootstrap serverBootstrap;

	EventLoopGroup bossGroup = new NioEventLoopGroup(1);
	EventLoopGroup workerGroup = new NioEventLoopGroup();

	public void open() {
		serverBootstrap = new ServerBootstrap();

		try {
			serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)// 指定是一个NIO连接通道
					.handler(new LoggingHandler(LogLevel.INFO)).childHandler(new NettyTelnetInitializer());

			// 绑定对应的端口号,并启动开始监听端口上的连接
			Channel ch = serverBootstrap.bind(port).sync().channel();

			// 等待关闭,同步端口
			ch.closeFuture().sync();

			System.out.println(" ####  #   #  ###  #   #   ###   ###   ###  ");
			System.out.println("   #   #   #  #    ##  #  #     #     #  ## ");
			System.out.println("  #    ####   ##  # #  # #     #     #    # ");
			System.out.println("  #    #  #  #    #  # # #  #  #  #  #   # ");
			System.out.println(" #    #   #  #    #  ##  #  #  #  #  #   #  ");
			System.out.println("####  #   #  ###  #   #   ###   ###   ### ");
			System.out.println("                                        ##  ");
			System.out.println("                                         ## ");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}

	public void close() {
		bossGroup.shutdownGracefully();
		workerGroup.shutdownGracefully();
	}

}
