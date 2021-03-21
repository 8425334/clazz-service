package com.deb.clazz.common.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/18 22:45
 * @ProjectName clazz
 **/
@Data
public class VoteDiscussDetail {

    private long stuId;

    private long voteId;

    private int index;

    private String discuss;

    private Timestamp voteTime;

}