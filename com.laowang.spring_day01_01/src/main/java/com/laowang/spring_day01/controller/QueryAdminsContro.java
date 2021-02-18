package com.laowang.spring_day01.controller;

import com.laowang.spring_day01.domain.Admin;
import com.laowang.spring_day01.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryAdminsContro {

    @Autowired
    private AdminMapper adminMapper;
    @RequestMapping("/query")
    public List TestQuerydatas(){
        List<Admin> admins = adminMapper.queryAdmins();
        return admins;
    }
}
