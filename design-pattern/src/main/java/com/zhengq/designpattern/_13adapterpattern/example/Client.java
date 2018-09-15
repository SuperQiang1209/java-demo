package com.zhengq.designpattern._13adapterpattern.example;

import com.zhengq.designpattern._13adapterpattern.example.impl.OuterUserInfo;
import com.zhengq.designpattern._13adapterpattern.example.impl.UserInfo;

/**
 * 场景类
 *
 * @Author: Zhenggq
 * @Date: 2018/9/7 23:17
 * @Description:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //没有与外部系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库中查询101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }


        /**
         * 查看劳动服务公司信息场景
         */
        IUserInfo girl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
           girl.getMobileNumber();
        }

    }
}
