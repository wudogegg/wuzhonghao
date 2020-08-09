package com.cn.service;

import com.cn.pojo.House;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HouseService {


    List<House> findAll();
}
