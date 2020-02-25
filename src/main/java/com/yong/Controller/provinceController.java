package com.yong.Controller;

import com.alibaba.fastjson.JSON;
import com.yong.Pojo.City;
import com.yong.Service.ProvinceService;
import com.yong.Utils.LocationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
public class provinceController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("/select")
    @ResponseBody
    public String select(){
        List<Object> object= new ArrayList<>();
        List<City> list =provinceService.select1();
        for(int i=0;i<list.size();i++){
            object.add(list.get(i).getMap());
        }
        //System.out.println(JSON.toJSONString(object));
        return JSON.toJSONString(object);
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/detail")
    public String detail(){
        return "detail";
    }
    @RequestMapping("/Test")
    @ResponseBody
    public String Test(){
        List<City> list = provinceService.select1();
        for(City c:list){

            System.out.println(LocationUtils.getDistance(c.getCity_lo(), c.getCity_la(),117.17,31.52));
        }
        return null;
    }
}
