package com.funtl.oauth2.server.dao;


import com.funtl.oauth2.server.entity.TbPermission;
import com.funtl.oauth2.server.entity.TbUser;
import com.funtl.oauth2.server.myMapper.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);

}