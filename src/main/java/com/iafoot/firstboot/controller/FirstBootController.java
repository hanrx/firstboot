package com.iafoot.firstboot.controller;

import com.iafoot.firstboot.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*该类使用了**@RestController注解，该注解是一个复合注解**，其所包含的比较重要的注解是
**@Controller和@ResponseBody，指定controller返回的对象自动转化为json格式并返回（基本类型及其包装类、String除外）***/
@Api("user相关api")
@RestController
@RequestMapping("/user")
public class FirstBootController {

    /**
     * > @Api：通常用来为一个controller类做注解，说明该controller的职能。
     * > @ApiOperation：通常用来为一个接口做注释，说明该接口的职能。
     * > @ApiImplicitParams：通常用来包含接口的一组参数注解，可以将其简单地理解为参数注解的集合。
     * > @ApiImplicitParam：用在@AplimplicitParams注解中，说明一个请求参数的各个方面。该注解包含的常用选项有如下。
     *
     * >> paramType，参数所放置的地方，包含query、header、path、body及form，最常用的是前4个。注意，**query域中的值使用@RequestHeader获取，path域中的值使用@PathVariable获取，body域中的值使用@RequestBody获取，否则可能出错**。
     * >> name，参数名。
     * >> dataType，参数类型。
     * >> required，参数是否必须传。
     * >> value，参数的值。
     * >> defaultValue，参数的默认值。
     *
     * @ApiResponses：用来包含接口的一组响应注解，可理解为响应注解的集合。
     * @ApiResponse：用在@ApiResponses中，用于表达一个错误的响应信息。
     * > code，即httpCode数字，例如400。
     * > message，信息，例如“请求参数没填好”。
     */
    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "id",dataType = "int",required = true,value = "用户的id",defaultValue = "1")
    })
    @ApiResponses({
        @ApiResponse(code = 400,message = "请求参数没填好"),
        @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    public User getUserInfo(@RequestParam("id") int id){
        if (id==1){
            return new User(1,"小红","123456");
        }
        return new User(2,"小刚","123456");
    }

/*//    提供了一个接口，并返回一个String
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello,this is my first boot program!";
    }*/
}
