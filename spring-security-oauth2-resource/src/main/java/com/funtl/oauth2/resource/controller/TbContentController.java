package com.funtl.oauth2.resource.controller;

import com.funtl.oauth2.resource.entity.TbContent;
import com.funtl.oauth2.resource.response.ResponseResult;
import com.funtl.oauth2.resource.service.ITbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lubiao
 * @createDate 2019年04月26日 上午 10:41:00
 */
@RestController
public class TbContentController {

    @Autowired
    private ITbContentService contentService;


    @GetMapping("/")
    public ResponseResult<List<TbContent>> list(){
        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(),contentService.selectAll());
    }
}
