package com.offcn.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@Controller
public class HtmlController {
    @RequestMapping("/")
    public String index() {
        return "meta.html";
    }
}
