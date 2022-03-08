package com.yjxxt.springboot.test;

import com.yjxxt.springboot.config.IocConfig;
import com.yjxxt.springboot.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //读取核心配置文件
        AnnotationConfigApplicationContext app =new AnnotationConfigApplicationContext(IocConfig.class);
        //获取bean
        UserService appBean = app.getBean("userService", UserService.class);
        //调用方法
        appBean.test01();
        System.out.println(app.isSingleton("userService"));
        System.out.println(app.isSingleton("iocConfig"));
    }
}
