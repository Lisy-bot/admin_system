package com.lisy.admin.controller;

import com.lisy.admin.model.AdminUser;
import com.lisy.admin.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AdminUserController {
    @Autowired
    AdminUserService adminUserService;

    @GetMapping("/selectUser")
    public List<AdminUser> adminUser(){

      return adminUserService.selectAll();
    }

    @RequestMapping("/")
    public String toString() {
        return super.toString();
    }
}
