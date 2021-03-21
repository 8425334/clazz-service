package com.deb.clazz.manager.mapper;

import com.deb.clazz.common.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/19 13:00
 * @ProjectName clazz
 **/
@Mapper
public interface StudentMapper {

    Student findById(@Param("id") long id);

}
