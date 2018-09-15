package com.zhengq.designpattern._05builderpattern.example;

import com.zhengq.designpattern._05builderpattern.example.impl.BMWBuilder;
import com.zhengq.designpattern._05builderpattern.example.impl.BMWModel;
import com.zhengq.designpattern._05builderpattern.example.impl.BenzBuilder;
import com.zhengq.designpattern._05builderpattern.example.impl.BenzModel;

import java.util.ArrayList;

/**
 * Client
 *
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: Zhenggq
 * @CreateDate: 2018/9/7 22:32
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 客户告诉xx公司，我要这样一个模型，然后xx公司就告诉我老大<br/>
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */

        BenzModel benz = new BenzModel();
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        // 客户需求,run的时候先发动引擎
        sequence.add("engine boom");
        // 启动起来
        sequence.add("start");
        // 开了一段就停下来
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();

        /**
         * 修改后场景
         */
        // 要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        // 把顺序给这个Builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        // 制造出一个奔驰车
        BenzModel benz2 = (BenzModel) benzBuilder.getCarModel();
        // 奔驰车跑一下看看
        benz2.run();

        // 按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();

        /**
         * 增加导演类后，修改场景
         */
        Director director = new Director();
        // 1万辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }

        // 100万辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }

        // 1000万辆C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getCBmwModel().run();
        }
    }
}
