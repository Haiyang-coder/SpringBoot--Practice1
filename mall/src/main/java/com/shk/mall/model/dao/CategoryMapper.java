package com.shk.mall.model.dao;

import com.shk.mall.model.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}