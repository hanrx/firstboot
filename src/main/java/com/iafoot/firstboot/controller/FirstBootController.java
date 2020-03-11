package com.iafoot.firstboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*该类使用了**@RestController注解，该注解是一个复合注解**，其所包含的比较重要的注解是
**@Controller和@ResponseBody，指定controller返回的对象自动转化为json格式并返回（基本类型及其包装类、String除外）***/
@RestController
@RequestMapping("/firstboot")
public class FirstBootController {
//    提供了一个接口，并返回一个String
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello,this is my first boot program!";
    }
}
