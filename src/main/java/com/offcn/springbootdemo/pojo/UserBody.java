package com.offcn.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@ConfigurationProperties(prefix = "userbody")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBody {
    private String name;
    private String password;
    private String birthday;
    private String mobile;
    private String address;
}
