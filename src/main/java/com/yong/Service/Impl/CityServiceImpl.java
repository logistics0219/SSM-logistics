package com.yong.Service.Impl;

import com.yong.Dao.CityDao;
import com.yong.Pojo.City;
import com.yong.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> select1() {
        return cityDao.selectAll();
    }
}
