package com.laowang.spring_day01.mapper;

import com.laowang.spring_day01.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    public List<Admin> queryAdmins();
}
