package com.funtl.oauth2.resource.dao;

import com.funtl.oauth2.resource.entity.TbContentCategory;
import com.funtl.oauth2.resource.myMapper.MyMapper;

public interface TbContentCategoryMapper extends MyMapper<TbContentCategory> {
    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);
}