package com.zhenggq.server.command;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: zhenggq
 * @CreateDate:
 * @Description:
 */
public class CommandVO {

    /**
     * 功能描述: 定义参数名与参数的分割符,一般是空格
     *
     * @auther: Zhenggq
     * @date: 2018/9/7
     */
    private final static String DIVIDE_FLAG = " ";

    /**
     * 功能描述: 定义参数前的符号,一把是-，如ls -l
     *
     * @auther: Zhenggq
     * @date: 2018/9/7
     */
    private final static String PREFIX = "-";

    /**
     * 命令名称
     */
    private String commandName;
    
    /**
     * 操作列表
     */
    private ArrayList<String> paramList;

    /**
     * 参数列表
     */
    private ArrayList<String> dataList;

    public CommandVO(String commandStr) {
        paramList = Lists.newArrayList();
        dataList = Lists.newArrayList();

        // ls -l
        if (!StringUtils.isEmpty(commandStr)) {
            // 解析命令
            String[] complesArr = commandStr.split(CommandVO.DIVIDE_FLAG);
            // 第一个参数是执行命令
            commandName = complesArr[0];

            // 获取后续 操作/参数
            for (int i = 1; i < complesArr.length; i++) {
                if (complesArr[i].startsWith(PREFIX)) {
                    paramList.add(complesArr[i]);
                } else {
                    dataList.add(complesArr[i]);
                }
            }
        }
    }

    public String getCommandName() {
        return commandName;
    }

    public ArrayList<String> getParam() {
        return paramList;
    }

    public ArrayList<String> getData() {
        return dataList;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("commandName", commandName).add("paramList", paramList).add("dataList", dataList).toString();
    }
}
