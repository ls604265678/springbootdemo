package com.offcn.springbootdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@RestController
@RequestMapping("/validate")
public class ValidateController {
    @RequestMapping("/valid/{group:[a-zA-Z0-9_]+}/{id}")
    public String validate1(@PathVariable(name="group") String group, @PathVariable(name="id") int id){
        return group+":"+id;
    }
}
