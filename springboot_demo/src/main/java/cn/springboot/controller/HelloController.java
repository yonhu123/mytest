package cn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("helloController")
public class HelloController {
	public HelloController() {
		System.out.println("hello");
	}
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "你好, 世界!!";
	}

	@RequestMapping("/demo")
	@ResponseBody
	public String demo() {
		return "初始化完成";
	}
}
