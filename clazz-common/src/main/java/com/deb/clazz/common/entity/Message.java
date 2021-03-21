package com.deb.clazz.common.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/18 22:35
 * @ProjectName clazz
 **/
@Data
public class Message {

    private long id;

    private Timestamp createTime;

    private String title;

    private String content;

    private long clsId;

    private long adminId;

}
