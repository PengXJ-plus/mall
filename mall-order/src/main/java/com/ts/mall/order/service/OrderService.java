package com.ts.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ts.common.utils.PageUtils;
import com.ts.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 15:16:41
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

