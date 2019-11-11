package com.lisy.admin.service;

import com.lisy.admin.dao.AdminUserMapper;
import com.lisy.admin.model.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserService {

    @Autowired
    AdminUserMapper adminUserMapper;

    public List<AdminUser> selectAll(){
        return  adminUserMapper.selectAll();
    }
}
