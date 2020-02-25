package com.yong.Service.Impl;

import com.yong.Dao.ProvinceDao;
import com.yong.Pojo.Province;
import com.yong.Service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao provinceDao;
    @Override
    public Province selectByName(String name) {
        return provinceDao.selectByName(name);
    }
}
