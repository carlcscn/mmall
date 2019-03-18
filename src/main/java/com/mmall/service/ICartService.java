package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;
import org.springframework.stereotype.Service;

/**
 * Created by liu_changshi on 2019/3/18.
 */

public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
}
