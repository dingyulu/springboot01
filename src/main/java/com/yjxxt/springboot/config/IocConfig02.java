package com.yjxxt.springboot.config;

import com.yjxxt.springboot.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration//定义当前类为配置类，相当于一个xml配置文件
@ComponentScan(value = "com.yjxxt.springboot")//扫描那个包下的配置文件
@PropertySource(value = {"jdbc.properties","user.properties"})
public class IocConfig02 {
    @Value("${user.userName}")
    private String userName;

    @Value("${user.password}")
    private String password;

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Override
    public String toString() {
        return "IocConfig02{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
