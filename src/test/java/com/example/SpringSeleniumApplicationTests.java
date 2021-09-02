package com.example;

import com.example.student.Address;
import com.example.student.Salary;
import com.example.student.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {
	@Autowired
	private User user;
	@Autowired
	private Address address;
	@Autowired
	private Salary salary;

	private String frts;
	@Test
	void contextLoads() {
		System.out.println(frts);
		user.printDetails();
		user.printDetails();
		user.printDetails();
	}

}
