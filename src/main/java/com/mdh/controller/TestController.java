package com.mdh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mdh
 * @date 2018/7/23
 */
@RestController
public class TestController {
    final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hello")
    public String hello(){
        logger.info("dev");
        logger.debug("debug");
        logger.error("error");
        logger.warn("warn");
        return "Hello Spring Boot !!!!";
    }
}
