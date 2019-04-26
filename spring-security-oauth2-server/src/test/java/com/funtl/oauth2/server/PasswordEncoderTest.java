package com.funtl.oauth2.server;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author lubiao
 * @createDate 2019年04月25日 上午 11:45:00
 */
public class PasswordEncoderTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
