package cn.springboot.test;

import cn.springboot.MySpringBootApplication;
import cn.springboot.domain.User;
import cn.springboot.register.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class TestJpa {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() {
		List<User> users = userRepository.findAll();
		System.out.println(users);
	}
}
