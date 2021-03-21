package com.deb.clazz.manager.controller;

import com.deb.clazz.common.entity.Admin;
import com.deb.clazz.manager.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @PostMapping()
    public ResponseEntity<Object> create(@RequestBody Admin admin) {
        adminService.create(admin);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
