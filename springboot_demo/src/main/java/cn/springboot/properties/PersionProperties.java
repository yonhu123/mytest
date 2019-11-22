package cn.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("persionProperties")
@ConfigurationProperties(prefix = "person2")
public class PersionProperties {

	private String name;
	private String birthday;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PersionProperties{" +
				"name='" + name + '\'' +
				", birthday='" + birthday + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
