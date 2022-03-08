package com.yjxxt.springboot.test;

import com.yjxxt.springboot.config.IocConfig;
import com.yjxxt.springboot.config.IocConfig02;
import com.yjxxt.springboot.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring02 {
    public static void main(String[] args) {
        //读取核心配置文件
        AnnotationConfigApplicationContext app =new AnnotationConfigApplicationContext(IocConfig02.class);
        //获取bean
        IocConfig02 appBean = app.getBean("iocConfig02", IocConfig02.class);
        //调用方法
        String s = appBean.toString();
        System.out.println(s);

    }
}
