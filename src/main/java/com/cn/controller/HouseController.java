package com.cn.controller;


import com.cn.pojo.House;
import com.cn.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("house")
@Controller
public class HouseController {


    @Autowired
    private HouseService  houseService;

    @RequestMapping("test0")
//    @ResponseBody
    public String test(){
        return "/WEB-INF/list.html";

    }

    @RequestMapping("test1")
    @ResponseBody
    public Map test1(){


        List<House> all = houseService.findAll();

        System.out.println(all.toString());



        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
//        map.put("count",6);//总记录数
        map.put("data",all);//分页数据


        return map;

    }

}
