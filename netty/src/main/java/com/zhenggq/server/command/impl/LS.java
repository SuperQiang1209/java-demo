package com.zhenggq.server.command.impl;

import com.zhenggq.server.command.AbstractLS;
import com.zhenggq.server.command.CommandVO;

public class LS extends AbstractLS {

	@SuppressWarnings("static-access")
	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}

	@Override
	protected String echo(CommandVO vo) {
		return null;
	}

}
