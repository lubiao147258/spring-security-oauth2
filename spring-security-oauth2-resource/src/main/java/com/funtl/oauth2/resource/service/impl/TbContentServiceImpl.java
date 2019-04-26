package com.funtl.oauth2.resource.service.impl;

import com.funtl.oauth2.resource.dao.TbContentMapper;
import com.funtl.oauth2.resource.entity.TbContent;
import com.funtl.oauth2.resource.service.ITbContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lubiao
 * @createDate 2019年04月26日 上午 10:33:00
 */
@Service
public class TbContentServiceImpl implements ITbContentService{

    @Resource
    private TbContentMapper contentMapper;

    @Override
    public List<TbContent> selectAll() {
        return contentMapper.selectAll();
    }
}
