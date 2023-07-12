package com.aws.training.demo.aws;




import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	public static Logger log = LoggerFactory.getLogger(ApplicationTests.class);

	@Test
	void contextLoads() {
		
		log.info("Test case successfully execusted!!");
		assertEquals(true, true);
	}

}
