package com.jin.controller;

import com.jin.domain.City;
import com.jin.domain.CommonResult;
import com.jin.domain.Province;
import com.jin.service.CityAndProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: JinBo
 * @Date: 2021/7/10 16:36
 * @Version: 1.0
 */
@Controller
public class ProvinceCityController {
    @Resource
    private CityAndProvinceService service;

    // 添加一个城市
    @RequestMapping("/city/addCity.do")
    @ResponseBody
    public CommonResult addCity(City city){
        int i = service.addCity(city);
        CommonResult cr;
        if (i > 0){
            cr = new CommonResult(0, "添加成功", city);
        }else {
            cr = new CommonResult(1, "添加失败", null);
        }
        return cr;
    }

    // 查询所有省份
    @RequestMapping("/queryAllProvinces.do")
    @ResponseBody
    public CommonResult queryAllProvinces(){
        List<Province> provinces = service.queryAllProvinces();
        CommonResult cr;
        if (provinces != null && provinces.size() > 0){
            cr = new CommonResult(0, "查询成功", provinces);
        }else {
            cr = new CommonResult(1, "查询无结果", null);
        }
        return cr;
    }

    // 查询所有省份
    @RequestMapping("/city/queryAllCityByProvinceId.do")
    @ResponseBody
    public CommonResult queryAllCityByProvinceId(Integer id){
        List<City> cities = service.queryCitiesByProvinceId(id);
        CommonResult cr;
        if (cities != null && cities.size() > 0){
            cr = new CommonResult(0, "查询成功", cities);
        }else {
            cr = new CommonResult(1, "查询无结果", null);
        }
        return cr;
    }
}
