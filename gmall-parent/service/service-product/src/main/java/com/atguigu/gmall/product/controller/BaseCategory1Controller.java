package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.product.service.BaseCategory1Service;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 琉
 * @create 2021-12-16 22:59
 */
@RestController
@RequestMapping( value = "/api/product")
public class BaseCategory1Controller {

    @Autowired
    private BaseCategory1Service baseCategory1Service;
    /**
     * 根据id查询二级分类
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/getById1/{id}")
    public Result getById1(@PathVariable(value = "id") Long id){

        return Result.ok(baseCategory1Service.getById(id));
    }


}
