package com.deb.clazz.manager.dto;

import com.deb.clazz.common.entity.Student;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/19 12:57
 * @ProjectName clazz
 **/
@Data
public class StudentDTO {
    List<Student> students;
}
