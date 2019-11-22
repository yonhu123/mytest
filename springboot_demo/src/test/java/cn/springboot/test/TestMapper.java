package cn.springboot.test;

import cn.springboot.MySpringBootApplication;
import cn.springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class TestMapper {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void test1() {
		System.out.println(userMapper.queryUserList());
	}
}
