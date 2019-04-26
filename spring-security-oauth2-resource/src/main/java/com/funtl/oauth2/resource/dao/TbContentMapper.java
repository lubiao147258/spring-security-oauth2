package com.funtl.oauth2.resource.dao;

import com.funtl.oauth2.resource.entity.TbContent;
import com.funtl.oauth2.resource.myMapper.MyMapper;

public interface TbContentMapper extends MyMapper<TbContent> {
    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}