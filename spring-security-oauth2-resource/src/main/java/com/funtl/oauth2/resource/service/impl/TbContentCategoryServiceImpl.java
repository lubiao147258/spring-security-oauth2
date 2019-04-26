package com.funtl.oauth2.resource.service.impl;

import com.funtl.oauth2.resource.dao.TbContentCategoryMapper;
import com.funtl.oauth2.resource.service.ITbContentCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lubiao
 * @createDate 2019年04月26日 上午 10:35:00
 */
@Service
public class TbContentCategoryServiceImpl implements ITbContentCategoryService {

    @Resource
    private TbContentCategoryMapper contentCategoryMapper;
}
