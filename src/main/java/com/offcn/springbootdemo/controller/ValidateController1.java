package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.pojo.Car;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@RestController
@Validated
@RequestMapping("/validate1")
public class ValidateController1 {
    @RequestMapping("/valid2")
    public String param(@NotBlank(message = "group不能为空")
                        @RequestParam("group") String group,

                        @NotBlank(message = "email不能为空")
                        @Email(message="不符合邮箱规格")
                        @RequestParam("email") String email) {
        return group + ":" + email;
    }
    @RequestMapping("/getcarvalidation1")
    public Car getcarvalidation1(@RequestBody @Validated Car car) {

        return car;
    }
}
