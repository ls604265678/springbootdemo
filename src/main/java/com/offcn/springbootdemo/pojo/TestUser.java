package com.offcn.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "testuser")
public class TestUser {
    private String name;
    private String password;
    private String birthday;
}
