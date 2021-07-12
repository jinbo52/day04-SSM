package com.jin.service;

import com.jin.domain.City;
import com.jin.domain.Province;

import java.util.List;

/**
 * @Author: JinBo
 * @Date: 2021/7/10 16:08
 * @Version: 1.0
 */
public interface CityAndProvinceService {
    int addCity(City city);

    List<City> queryCitiesByProvinceId(Integer id);

    List<Province> queryAllProvinces();
}
