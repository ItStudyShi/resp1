package com.laowang.spring_day01;


import com.laowang.spring_day01.domain.Admin;
import com.laowang.spring_day01.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTestCode {

    @Autowired
     private AdminMapper adminMapper;
    @Test
    public void tsest(){
        List<Admin> admins = adminMapper.queryAdmins();
    System.out.println(admins);
    }
}
