package com.jin.dao;

import com.jin.domain.Province;

import java.util.List;

/**
 * @Author: JinBo
 * @Date: 2021/7/10 15:52
 * @Version: 1.0
 */
public interface ProvinceDao {
    List<Province> selectAllProvinces();
}
