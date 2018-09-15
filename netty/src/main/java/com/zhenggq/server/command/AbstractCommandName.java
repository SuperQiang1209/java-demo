package com.zhenggq.server.command;


/**
 * 功能描述: 命令处理链 比如:用户输入 ls 依次去匹配找到合适的命令处理器
 * 责任链模式
 *
 * @author: Zhenggq
 * @date: 2018/9/7
 */
public abstract class AbstractCommandName {

    /**
     * 功能描述: 下一个命令
     *
     * @author: Zhenggq
     * @date: 2018/9/7
     */
    private AbstractCommandName nextCommand;

    /**
     * 功能描述: 对命令进行处理
     *
     * @param:vo 命令对象
     * @return:
     * @author: Zhenggq
     * @date: 2018/9/7
     */
    public final String handlerCommand(CommandVO vo) {
        // 处理结果
        String result = "";
        // 判断是否是自己处理的参数
        if (vo.getParam().size() == 0 || vo.getParam().contains(this.getOperateParam())) {
            this.echo(vo);
        } else {
            if (this.nextCommand != null) {
                this.nextCommand.echo(vo);
            } else {
                // 返回帮助 help
                result = "命令无效";
            }
        }
        return result;
    }

    /**
     * 功能描述: 设置下一个处理器
     *
     * @param: command
     * @author: Zhenggq
     * @date: 2018/9/7
     */
    public void setNext(AbstractCommandName command) {
        this.nextCommand = command;
    }

    /**
     * 功能描述: 获取当前命令的处理参数,比如 "ls","ls -a","-a"及参数
     *
     * @return: 命令参数
     * @author: Zhenggq
     * @date: 2018/9/7
     */
    protected abstract String getOperateParam();

    /**
     * 执行命令
     *
     * @param vo
     * @return
     * @author: Zhenggq
     */
    protected abstract String echo(CommandVO vo);

    @Override
    public String toString() {
        return "AbstractCommandName{" +
                "nextCommand=" + nextCommand +
                '}';
    }
}
