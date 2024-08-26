package com.example.Loose.Coupling.mapper;

import com.example.Loose.Coupling.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
}