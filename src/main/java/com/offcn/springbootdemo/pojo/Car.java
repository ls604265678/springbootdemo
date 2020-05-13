package com.offcn.springbootdemo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car extends ErrorModel{
    @Max(value = 100,message = "最大100")
    @Min(value = 1,message = "最小1")
    private Integer id;
    @Pattern(regexp = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$",
            message = "手机号格式不合法")
    @Length(min=2,max=15,message = "最大{max},最小{min}")
    private String name;
    @DecimalMin(value="1.0",message="价格最低1元")
    @DecimalMax(value="10.0",message="价格最高10元")
    private Float price;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createdate;
    @Email
    private String email;
}
