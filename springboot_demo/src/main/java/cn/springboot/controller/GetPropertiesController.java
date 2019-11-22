package cn.springboot.controller;

import cn.springboot.properties.PersionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("getProperties")
public class GetPropertiesController {
	@Value("${usernames}")
	private String name;

	@Autowired
	PersionProperties persionProperties;

	@GetMapping("/getName")
	@ResponseBody
	public String getName() {
		return name;
	}

	@GetMapping("/getPerson")
	@ResponseBody
	public String getPerson() {
		return persionProperties.toString();
	}
}
