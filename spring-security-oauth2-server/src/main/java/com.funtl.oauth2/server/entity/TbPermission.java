package com.funtl.oauth2.server.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TbPermission {
    private Long id;

    private Long parentId;

    private String name;

    private String enname;

    private String url;

    private String description;

    private Date created;

    private Date updated;

}