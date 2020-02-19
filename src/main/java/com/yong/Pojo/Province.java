package com.yong.Pojo;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Province {
    private Integer id;
    private String name;
    private Double number;
    private String color;

    public Map<String,Object> getMap(){
        Map<String,Object> m = new HashMap();
        m.put("color",this.getColor());
        Map<String,Object> ma = new HashMap();
        ma.put("normal", new JSONObject(m));
        Map<String,Object> map= new HashMap();
        map.put("value", this.getNumber());
        map.put("name", this.getName());
        map.put("itemStyle",new JSONObject(ma));
        return map;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
