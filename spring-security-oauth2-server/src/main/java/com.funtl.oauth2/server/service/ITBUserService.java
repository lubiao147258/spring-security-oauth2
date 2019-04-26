package com.funtl.oauth2.server.service;


import com.funtl.oauth2.server.entity.TbUser;
import org.springframework.stereotype.Service;

/**
 * @author lubiao
 * @createDate 2019年04月25日 下午 04:12:00
 */
public interface ITBUserService {

    TbUser getByUsername(String username);
}
