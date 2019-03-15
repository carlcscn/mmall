package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by liu_changshi on 2019/3/15.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}
