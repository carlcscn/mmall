package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by liu_changshi on 2019/3/24.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
    ServerResponse aliCallback(Map<String,String> params);
    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);
    ServerResponse createOrder(Integer userId,Integer shippingId);
    ServerResponse<String> cancel(Integer userId,Long orderNo);
    ServerResponse getOrderCartProduct(Integer userId);
}
