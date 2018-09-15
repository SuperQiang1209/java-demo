package com.zhenggq.server.command.impl;

import com.zhenggq.server.command.AbstractBYE;
import com.zhenggq.server.command.CommandVO;

public class BYE extends AbstractBYE {

	@SuppressWarnings("static-access")
	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}

	@Override
	protected String echo(CommandVO vo) {
		return "";
	}

}
