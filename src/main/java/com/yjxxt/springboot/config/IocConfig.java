package com.yjxxt.springboot.config;

import com.yjxxt.springboot.mapper.RoleMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration//定义当前类为配置类，相当于一个xml配置文件
@ComponentScan(value = "com.yjxxt.springboot")//扫描那个包下的配置文件
public class IocConfig {
    /**
     * <bean id = "UserMapper" class  ="con.yjxxt.mapper.RoleMapper"></bean>
     * @return
     */
    @Bean
    public RoleMapper roleMapper(){
        return new RoleMapper();
    }
}
