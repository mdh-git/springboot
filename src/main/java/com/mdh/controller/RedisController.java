package com.mdh.controller;

import com.mdh.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Redis的操作
 * @author madonghao
 * @date 2018/11/7
 */
@RestController
public class RedisController {

    @Autowired
    private RedisDao redisDao;

    @RequestMapping("/set")
    public String setKeyAndValue(String key, String value){
        redisDao.setKey(key, value);
        return "success";
    }

    @RequestMapping("/get")
    private String getValueByKey(String key) {
        return redisDao.getValue(key);
    }
}
