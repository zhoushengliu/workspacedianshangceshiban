package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;

/**
 * @author 琉
 * @create 2021-12-16 22:58
 */
public interface BaseCategory1Service {
    /**
     * 根据id查询一级分类
     * @param id
     * @return
     */
    public BaseCategory1 getById(Long id);
}
