package com.ts.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ts.common.utils.PageUtils;
import com.ts.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 16:45:29
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

