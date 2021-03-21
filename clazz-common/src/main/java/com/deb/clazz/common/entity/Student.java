package com.deb.clazz.common.entity;

import lombok.Data;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/18 21:23
 * @ProjectName clazz
 **/
@Data
public class Student {

    private long id;

    private String username;

    private String password;

    private String name;

    private String phone;

    private long clsId;

}
