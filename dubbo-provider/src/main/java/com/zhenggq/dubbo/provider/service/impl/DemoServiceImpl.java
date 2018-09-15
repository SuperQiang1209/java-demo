package com.zhenggq.dubbo.provider.service.impl;

import com.zhenggq.dubbo.api.IDemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 15:15
 * @Description:
 * @Version: 1.0
 */
public class DemoServiceImpl implements IDemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
