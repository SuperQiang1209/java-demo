package com.zhengq.designpattern._99buildpattern;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 20:56
 * @Description:
 * @Version: 1.0
 */
public class Peson {

    private String id;
    private String name;
    private String age;
    private String mobile;
    private String address;
    private String city;
    private String code;


    private Peson(Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.mobile = builder.mobile;
        this.address = builder.address;
        this.city = builder.city;
        this.code = builder.code;
    }

    public static class Builder {

        private String id;
        private String name;
        private String age;
        private String mobile;
        private String address;
        private String city;
        private String code;

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(String val) {
            age = val;
            return this;
        }

        public Builder mobile(String val) {
            mobile = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder code(String val) {
            code = val;
            return this;
        }

        public Peson build() {
            return new Peson(this);
        }

    }
}