package com.zmy.wechatsell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    /**
     * 日志级别：只有级别以上的可以输出
     *  ERROR(40, "ERROR"),
        WARN(30, "WARN"),
        INFO(20, "INFO"),
        DEBUG(10, "DEBUG"),
        TRACE(0, "TRACE");
     */

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        logger.debug("debug---");
        logger.info("info---");
        logger.error("error---");
    }

    /**
     * 使用了@SLF4J的注解可以直接使用log
     */
    @Test
    public void test2() {
        String name = "imooc";
        String password = "1234556";
        /**变量值的输出*/
        log.info("name: {},password: {}",name,password);
        log.debug("debug---");
        log.info("info---");
        log.error("error---");
    }
}
