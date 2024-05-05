package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author caramel
 * @email tiaogeng@foxmail.com
 * @date 2024-05-05 10:32:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
