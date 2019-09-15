package com.demo.hello;

import com.demo.hello.config.Enviroment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class ApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	Enviroment env;

	@Test
	public void contextLoads() {
		logger.debug(env.toString());
	}
}
