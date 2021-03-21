package com.deb.clazz.manager.mapper;

import com.deb.clazz.common.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {

    void create(@Param("p") Admin admin);
}
