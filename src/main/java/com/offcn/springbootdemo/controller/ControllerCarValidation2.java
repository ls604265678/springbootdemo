package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.pojo.Car;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@RestController
@Validated
public class ControllerCarValidation2 {
    @RequestMapping("/carvalid2")
    public String getcarvalidation4(Car car, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            car.setCode(300);
            car.setMessage(bindingResult.getFieldError().getDefaultMessage());
        }
        car.setCode(200);
        return car.toString();
    }

    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}
