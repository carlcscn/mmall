package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by liu_changshi on 2019/3/24.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
}
