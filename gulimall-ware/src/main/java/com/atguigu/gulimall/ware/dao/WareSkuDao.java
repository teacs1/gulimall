package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author caramel
 * @email tiaogeng@foxmail.com
 * @date 2024-05-05 11:07:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
