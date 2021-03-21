package com.deb.clazz.manager.controller;

import com.deb.clazz.common.entity.Student;
import com.deb.clazz.manager.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Deb
 * @Date 2021/3/19 13:07
 * @ProjectName clazz
 **/
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @RequestMapping("/{id}")
    public ResponseEntity<Student> queryStudents(@PathVariable long id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);

    }

}
