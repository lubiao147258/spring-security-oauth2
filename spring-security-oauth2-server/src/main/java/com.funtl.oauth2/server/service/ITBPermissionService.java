package com.funtl.oauth2.server.service;


import com.funtl.oauth2.server.entity.TbPermission;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lubiao
 * @createDate 2019年04月25日 下午 04:21:00
 */
public interface ITBPermissionService {

    List<TbPermission> selectByUserId(Long userId);
}
