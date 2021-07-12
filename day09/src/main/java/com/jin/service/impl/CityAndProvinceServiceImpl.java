package com.jin.service.impl;

import com.jin.dao.CityDao;
import com.jin.dao.ProvinceDao;
import com.jin.domain.City;
import com.jin.domain.Province;
import com.jin.service.CityAndProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JinBo
 * @Date: 2021/7/10 16:13
 * @Version: 1.0
 */
@Service
public class CityAndProvinceServiceImpl implements CityAndProvinceService {
    @Autowired
    private CityDao cityDao;

    @Autowired
    private ProvinceDao provinceDao;
    @Override
    public int addCity(City city) {
        return cityDao.addCity(city);
    }

    @Override
    public List<City> queryCitiesByProvinceId(Integer id) {
        return cityDao.selectCitiesByProvinceId(id);
    }

    @Override
    public List<Province> queryAllProvinces() {
        return provinceDao.selectAllProvinces();
    }
}
