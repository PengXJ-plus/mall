package com.ts.mall.member.dao;

import com.ts.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 16:45:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
