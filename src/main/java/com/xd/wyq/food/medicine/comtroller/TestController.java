package com.xd.wyq.food.medicine.comtroller;

import com.alibaba.fastjson.JSON;
import com.xd.wyq.food.medicine.repository.MonitorFolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pengwei
 * 2018/3/1.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private MonitorFolderRepository monitorFolderRepository;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @ResponseBody
    @RequestMapping("/t1")
    public String test(){
        return "中文测试";
    }

    @ResponseBody
    @RequestMapping("/t2")
    public String test2(){
        return JSON.toJSONString(monitorFolderRepository.findAll());
    }

    @ResponseBody
    @RequestMapping("/t3")
    public String test3(){
        stringRedisTemplate.opsForValue().set("hello","world !~");
        return "Ok";
    }

    @ResponseBody
    @RequestMapping("/t4")
    public String test4(){

        return stringRedisTemplate.opsForValue().get("hello");
    }
}
