package com.zhenggq.datastructure.sort;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/13 09:23
 * @Description:
 * @Version: 1.0
 */
public class Test {


    /**
     * 汉语中数字大写
     */
    private final static String[] CN_UPPER_NUMBER;

    /**
     * 金额单位
     */
    private final static String[] CN_UPPER_UNIT;

    /**
     * 整
     */
    private final static String WHOLE;


    /**
     * 特殊字符：负
     */
    private static final String CN_NEGATIVE;

    /**
     * 金额的精度，默认值为2
     */
    private static final int MONEY_PRECISION;

    private Test() {

    }

    static {
        CN_UPPER_NUMBER = new String[]{"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        CN_UPPER_UNIT = new String[]{"分", "角", "元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟", "万", "兆"};
        WHOLE = "整";
        CN_NEGATIVE = "负";
        MONEY_PRECISION = 2;
    }


    public static String upperConvert(BigDecimal b) {
        String rstr = "";
        int num = b.signum();
        if (num == 0) {
            rstr = CN_UPPER_NUMBER[0];
            return rstr;
        } else if (num < 0) {
            rstr = CN_NEGATIVE;
        }

        b.round(new MathContext(2, RoundingMode.DOWN));


        return rstr;
    }

    public static void main(String[] args) {
        System.out.println(Test.upperConvert(new BigDecimal(0)));

        int i = 3000000;

        while (i>0) {
            int k = i % 10;
            System.out.println(k);
            i = i / 10;
        }
    }
}
