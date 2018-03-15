package com.zmy.wechatsell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.BigInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WechatsellApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test1() {
		BigDecimal bigDecimal = new BigDecimal(BigInteger.ZERO);

		log.info("bigDecimal={}",bigDecimal);
	}

}
