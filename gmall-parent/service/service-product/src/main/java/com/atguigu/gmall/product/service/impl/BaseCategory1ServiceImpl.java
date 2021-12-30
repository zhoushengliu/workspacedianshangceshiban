package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.service.BaseCategory1Service;
import org.hibernate.validator.internal.constraintvalidators.bv.time.futureorpresent.AbstractFutureOrPresentJavaTimeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 琉
 * @create 2021-12-16 23:45
 */
@Service
public class BaseCategory1ServiceImpl implements BaseCategory1Service {

    @Autowired
    private BaseCategory1Mapper baseCategory1Mapper;
    /**
     * 根据id查询一级分类
     *
     * @param id
     * @return
     */
    @Override
    public BaseCategory1 getById(Long id) {
      return  baseCategory1Mapper.selectById(id);

    }
}
