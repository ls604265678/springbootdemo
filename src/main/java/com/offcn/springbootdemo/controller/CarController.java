package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.pojo.Car;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@RestController
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/findone")
    public Car findOneCar(){
        Car car = new Car(1, "toyo", 1999.99F,new Date(),"13567890001");
        return car;
    }
    @RequestMapping("/getall")
    public List<Car> getAll(){
        List<Car> list=new ArrayList<>();
        Car car1 = new Car(1, "toyo", 1999.99F,new Date(),"13567890001");
        Car car2= new Car(2, "dazhong", 2999.99F,new Date(),"13567890001");
        Car car3 = new Car(3, "fengtian", 3999.99F,new Date(),"13567890001");
        Car car4 = new Car(4, "benchi", 4999.99F,new Date(),"13567890001");

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        return list;

    }
    @RequestMapping("/getCarById/{name}")
    public Car getCarById(@RequestParam(name="id") int id, @PathVariable(name="name") String name){
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        return car;
    }
    @RequestMapping("/getCarById1")
    public Car getCarById1(@RequestBody Car car){
        return car;
    }
    @RequestMapping("/getCarById2")
    public Car getCarById(Car car) {
        return car;
    }
    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){	        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}
