package com.yong.Controller;

import com.alibaba.fastjson.JSON;
import com.yong.Pojo.City;
import com.yong.Pojo.Province;
import com.yong.Service.CityService;
import com.yong.Service.ProvinceService;
import com.yong.Utils.LocationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
public class mainController {
    @Autowired
    private CityService cityService;
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("/select")
    @ResponseBody
    public String select(){
        List<Object> object= new ArrayList<>();
        List<City> list =cityService.select1();
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
    @RequestMapping("/tab1")
    public String tab1(){return "tab1"; }
    @RequestMapping("/tab2")
    public String tab2(){return "tab2"; }
    @RequestMapping("/tab3")
    public String tab3(){return "tab3"; }
    @RequestMapping("/tab4")
    public String tab4(){return "tab4"; }
    @RequestMapping("/detail")
    public String detail(){
        return "detail";
    }
    @RequestMapping("/Test")
    @ResponseBody
    public String Test(){
        Province p=provinceService.selectByName("福建省");
        List<City> list = cityService.select1();
        Map<Integer,Double> map=new HashMap<>();
        for(City c:list){
            map.put(c.getId(),LocationUtils.getDistance(c.getCity_lo(), c.getCity_la(),p.getCaptial_lo(),p.getCaptial_la()));
            //System.out.println();
        }
        return map.toString();
    }
}
