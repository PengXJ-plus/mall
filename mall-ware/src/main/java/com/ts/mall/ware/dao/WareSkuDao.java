package com.ts.mall.ware.dao;

import com.ts.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-20 21:01:30
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
