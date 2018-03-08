package com.zmy.wechatsell.service;

import com.zmy.wechatsell.dto.OrderDTO;

public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
