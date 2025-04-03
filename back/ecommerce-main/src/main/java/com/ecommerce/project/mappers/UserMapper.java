package com.ecommerce.project.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.ecommerce.project.dto.UserDTO;

@Mapper
public interface UserMapper {

    UserDTO selectUserId(UserDTO user);


}
