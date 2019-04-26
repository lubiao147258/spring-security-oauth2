package com.funtl.oauth2.server.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TbUser {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;


}