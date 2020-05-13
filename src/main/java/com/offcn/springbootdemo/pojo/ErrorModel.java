package com.offcn.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorModel {
    private Integer code;
    private String message;
}
