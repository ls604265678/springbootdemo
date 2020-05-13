package com.offcn.springbootdemo.controller;
import com.offcn.springbootdemo.pojo.TestUser;
import com.offcn.springbootdemo.pojo.UserBody;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableConfigurationProperties({UserBody.class, TestUser.class})
public class HelloConfigController {
    @Value("${offcn_ip}")
    private String offcn_ip;

    @Value("${offcn_port}")
    private String offcn_port;

    @GetMapping("/getvalue")
    public String getValue() {
        return "ip:"+offcn_ip+" port:"+offcn_port;
    }
    @Autowired
    UserBody userbody;
    @Autowired
    TestUser testUser;

    @GetMapping("/getUser")
    public String getUser(){
        return userbody.toString();
    }

    @GetMapping("/getTest")
    public String getTest(){
        return testUser.toString();
    }
}
