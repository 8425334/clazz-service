package com.deb.clazz.manager.service.impl;

import com.deb.clazz.common.entity.Student;
import com.deb.clazz.manager.service.StudentService;
import com.deb.clazz.manager.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/19 12:59
 * @ProjectName clazz
 **/
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public Student findById(long id) {
        return studentMapper.findById(id);
    }


}
