package com.zhenggq.server.command;

public class Invoker {

	Invoker invoker = null;

	private Invoker() {
	}

	public void getInstance() {
		if (invoker == null) {
			invoker = new Invoker();
		}
	}

	public String exec(String _commandStr) {
		// 定义返回值
		String result = "";

		// 解析命令
		CommandVO vo = new CommandVO(_commandStr);
		// 枚举中包含此命令
		if (CommandEnum.getNames().contains(vo.getCommandName())) {
			String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
			// 创建命令对象
			Command command;
			try {
				command = (Command) Class.forName(className).newInstance();
				// 执行命令
				result = command.execute(vo);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			result = "无法执行命令,请检查命令格式";
		}
		return result;
	}
}
