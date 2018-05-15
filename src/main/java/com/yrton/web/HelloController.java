package com.yrton.web;



import com.yrton.service.ints.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @Author: whmyit@163.com
 * @Description:
 * @Date: Created in 14:15  2018/3/13
 *
 */
@Controller // 默认返回json格式，如果需要页面开发使用@Controller
public class HelloController   {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
    @Autowired
    private InfoService infoService;

    @GetMapping({"/hello"})
    @ResponseBody
    public String hello(){

        logger.info("----------  hello spring boot");
        return infoService.SayHello("Zookeeper+dubbo+springboot");
    }


    @GetMapping({"/index","/"})
    public String index(){
        logger.info("---------- index222");
        return "index";
    }

    @GetMapping({"/info"})
    @ResponseBody
    public Object sysinfo(){

    return infoService.getAll();
    }


    @GetMapping({"/zkget"})
    @ResponseBody
    public Object zkget(){

//        Watcher watcher =


        return null;
    }

}
