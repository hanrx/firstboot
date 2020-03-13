package com.iafoot.firstboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * > @Getter：是一个Lombok注解，用来为POJO类生成getter方法。
 * > @AllArgsConstructor：是一个Lombok注解，用来为POJO类生成全参构造器。
 * > @ApiModel：是一个Swagger注解，用来为一个POJO类做注释。
 * > @ApiModelProperty：是一个Swagger注解，用来为POJO类中的属性做注释。
 */
@ApiModel("用户模型")
@AllArgsConstructor
@Getter
public class User {
    @ApiModelProperty("用户ID")
    private int id;
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户密码")
    private String password;
}
