package com.zhenggq.netty.command;

import com.zhenggq.server.command.CommandVO;
import org.junit.Test;

/**
 * @Auther: Zhenggq
 * @Date: 2018/9/7 21:50
 * @Description:
 * @Version: 1.0
 */
public class CommandTest {

    @Test
    public void enterCommand() {
        CommandVO vo = new CommandVO("ls -l -a 222 333");
        System.out.println("--------------------------------" + vo.toString());

    }

}
