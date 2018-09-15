package com.zhenggq.template.base;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 10:21
 * @Description:
 * @Version: 1.0
 */
public class BaseConverter<DO, VO> {

    public VO convert(DO from, Class<VO> clazz) {
        if (from == null) {
            return null;
        }
        VO to = null;

        try {
            to = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        convert(from, to);
        return to;
    }

    /**
     * 属性拷贝方法，有特殊需求时子类覆写此方法
     */
    protected void convert(DO from, VO to) {

        //BeanUtils.copyProperties(from, to);
    }


}
