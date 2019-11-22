package cn.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 表示是springboot启动类(SpringBootConfiguration)
@MapperScan(basePackages = "cn.springboot.mapper")
public class MySpringBootApplication {
	public static void main(String[] args) {
		/*
		 * 启动springboot
		 */
		SpringApplication.run(MySpringBootApplication.class, args);
	}

}
