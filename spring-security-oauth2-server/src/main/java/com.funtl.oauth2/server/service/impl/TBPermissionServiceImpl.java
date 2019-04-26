package com.funtl.oauth2.server.service.impl;

import com.funtl.oauth2.server.dao.TbPermissionMapper;
import com.funtl.oauth2.server.entity.TbPermission;
import com.funtl.oauth2.server.service.ITBPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lubiao
 * @createDate 2019年04月25日 下午 04:22:00
 */
@Service
public class TBPermissionServiceImpl implements ITBPermissionService {

    @Resource
    private TbPermissionMapper permissionMapper;


    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return permissionMapper.selectByUserId(userId);
    }
}
