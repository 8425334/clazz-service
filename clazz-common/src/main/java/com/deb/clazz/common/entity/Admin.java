package com.deb.clazz.common.entity;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/18 21:25
 * @ProjectName clazz
 **/
@Data
public class Admin {

    private long id;

    private String username;

    private String password;

    private boolean isSuper;

    private String phone;

    private String name;

}
