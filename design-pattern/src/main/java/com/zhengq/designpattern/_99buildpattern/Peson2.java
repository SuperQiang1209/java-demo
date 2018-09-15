package com.zhengq.designpattern._99buildpattern;

import javafx.util.Builder;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 21:23
 * @Description:
 * @Version: 1.0
 */
public class Peson2 implements Builder<Peson2> {

    private String id;
    private String name;
    private String age;
    private String mobile;
    private String address;
    private String city;
    private String code;

    private Peson2(Peson2 builder){
        builder.id=builder.id;
    }

    public Peson2 id(String val) {
        id = val;
        return this;
    }

    public Peson2 name(String val) {
        name = val;
        return this;
    }

    public Peson2 age(String val) {
        age = val;
        return this;
    }

    public Peson2 mobile(String val) {
        mobile = val;
        return this;
    }

    public Peson2 address(String val) {
        address = val;
        return this;
    }

    public Peson2 city(String val) {
        city = val;
        return this;
    }

    public Peson2 code(String val) {
        code = val;
        return this;
    }

    @Override
    public Peson2 build() {
        return null;
    }
}
