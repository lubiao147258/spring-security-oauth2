package com.funtl.oauth2.resource.service;

import com.funtl.oauth2.resource.entity.TbContent;

import java.util.List;

/**
 * @author lubiao
 * @createDate 2019年04月26日 上午 10:31:00
 */
public interface ITbContentService {

    List<TbContent> selectAll();
}
