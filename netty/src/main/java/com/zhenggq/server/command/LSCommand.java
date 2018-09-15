package com.zhenggq.server.command;

public class LSCommand extends Command {

	// 建立LS命令执行链
	@Override
	public String execute(CommandVO vo) {
		super.buildChain(AbstractLS.class);
		// 执行首个链
		return null;
	}

}
