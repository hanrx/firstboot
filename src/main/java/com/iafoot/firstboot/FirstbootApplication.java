package com.iafoot.firstboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***firstboot项目的项目名与aritfactId相同**，并且在firstboot项目下有一个路径最短的包com.iafoot.firstboot，该包名正好是<groupId>.<aritifactId>**并且主类就位于该最短路径包下**！
注意，这不是偶然，这是企业使用Spring Boot构建项目的最标准的做法。使用<groupId>.<artifactId>作为最短路径包名，不仅语义明确，而且也方便我们写maven-archetype,
而将主类放在最短路径包下，主要是为了方便@ComponentScan扫描整个项目中的类。*/

/*在主类上需要添加注解@SpringBootApplication，该注解是一个复合注解，其包含的比较重要的注解是以下三个。
@SpringBootConfiguration：该注解也是一个复合注解，其中最重要的注解是@Configuration，指明该类由Spring容器管理。
@EnableAutoConfiguration：该注解用于启动服务的自动配置功能。
@ComponentScan：该注解用于扫描类，其作用类似于Spring中的<context:component-scan>标签。*/
@SpringBootApplication
//FirstbootApplication.java被称为**主类或启动类**，是整个Spring Boot项目的**启动入口**
public class FirstbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstbootApplication.class, args);
    }

}
