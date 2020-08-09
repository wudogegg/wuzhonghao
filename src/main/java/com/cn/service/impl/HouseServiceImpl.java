package com.cn.service.impl;


import com.cn.dao.HouseMapper;
import com.cn.pojo.House;
import com.cn.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;


    @Override
    public List<House> findAll() {
        List<House> houses = houseMapper.selectByExample(null);

        return houses;


    }
}
