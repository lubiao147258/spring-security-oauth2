package com.funtl.oauth2.server.service.impl;

import com.funtl.oauth2.server.dao.TbUserMapper;
import com.funtl.oauth2.server.entity.TbUser;
import com.funtl.oauth2.server.service.ITBUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author lubiao
 * @createDate 2019年04月25日 下午 04:12:00
 */
@Service
public class TbUserServiceImpl implements ITBUserService {

    @Resource
    private TbUserMapper userMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return userMapper.selectOneByExample(example);
    }
}
