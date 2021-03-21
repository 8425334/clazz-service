package com.deb.clazz.common.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/18 22:41
 * @ProjectName clazz
 **/
@Data
public class Vote {

    private long id;

    private Timestamp createTime;

    private Timestamp endTime;

    private String title;

    private String content;

    private long clsId;

}
