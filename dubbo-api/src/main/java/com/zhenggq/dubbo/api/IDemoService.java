package com.zhenggq.dubbo.api;

import java.util.List;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/12 15:06
 * @Description:
 * @Version: 1.0
 */
public interface IDemoService {

    List<String> getPermissions(Long id);
}
