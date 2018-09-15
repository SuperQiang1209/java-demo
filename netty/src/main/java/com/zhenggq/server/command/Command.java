package com.zhenggq.server.command;

import java.util.List;

public abstract class Command {
	public abstract String execute(CommandVO vo);

	// 建立链表
	protected final List<? extends AbstractCommandName> buildChain(Class<? extends AbstractCommandName> abstractClass) {
		abstractClass.getClass().getSimpleName();
		return null;
	}
}
