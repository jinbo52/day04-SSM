package com.jin.dao;

import com.jin.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: JinBo
 * @Date: 2021/7/10 15:40
 * @Version: 1.0
 */

public interface CityDao {
    public abstract int addCity(City city);

    public abstract List<City> selectCitiesByProvinceId(@Param("pid") Integer provinceId);
}
