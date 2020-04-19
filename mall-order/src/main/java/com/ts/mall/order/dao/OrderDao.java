package com.ts.mall.order.dao;

import com.ts.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 15:16:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
