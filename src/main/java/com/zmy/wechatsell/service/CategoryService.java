package com.zmy.wechatsell.service;

import com.zmy.wechatsell.entity.ProductCategory;

import java.util.List;

/**
 * 2018-3-6
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
