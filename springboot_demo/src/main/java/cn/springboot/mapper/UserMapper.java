package cn.springboot.mapper;

import cn.springboot.domain.User;
// simport org.apache.ibatis.annotations.Mapper;

import java.util.List;

// @Mapper
public interface UserMapper {
	List<User> queryUserList();
}