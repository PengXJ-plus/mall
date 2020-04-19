package com.ts.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ts.common.utils.PageUtils;
import com.ts.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 16:45:30
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

