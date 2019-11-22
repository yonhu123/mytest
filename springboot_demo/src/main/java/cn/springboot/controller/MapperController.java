package cn.springboot.controller;

import cn.springboot.domain.User;
import cn.springboot.mapper.UserMapper;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/queryUser")
	@ResponseBody
	public String queryUser() {
		List<User> users = userMapper.queryUserList();
		return JSON.toJSONString(users);
	}
}
