package com.ts.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ts.common.utils.PageUtils;
import com.ts.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 16:45:29
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

