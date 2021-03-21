package com.deb.clazz.common.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/18 22:39
 * @ProjectName clazz
 **/
@Data
public class DiscussDetail {

    private long stuId;

    private long messageId;

    private String discuss;

    private Timestamp createTime;

}
