package com.javatechie.jenkin.api;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {
	
	static Logger logger  = LoggerFactory.getLogger( SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {

		logger.info("Test Case executing");
	 assertEquals(true,true);
	}

	private boolean assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		if(b == c){
			return true;
		}else{
			return false;
		}
	}


}
