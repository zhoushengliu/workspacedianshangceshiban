package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.apache.ibatis.javassist.tools.reflect.Sample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author 琉
 * @create 2021-12-16 22:59
 */
@RestController
@RequestMapping( value = "/api/product")
public class BaseCategory2Controller {

    @Autowired
    private BaseCategory2Service baseCategory2Service;
    /**
     * 根据id查询二级分类
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/getById2/{id}")
    public Result getById2(@PathVariable(value = "id") Long id){

        return Result.ok(baseCategory2Service.getById(id));
    }


    /**
     * 查询全部二级分类
     * @return
     */
    @GetMapping(value = "/getAll2")
    public Result getAll(){
        return Result.ok(baseCategory2Service.getAll());
    }

    /**
     * 新增
     * @return
     */
    @PostMapping("/add2")
    public Result add(@RequestBody BaseCategory2 baseCategory2){
        return Result.ok(baseCategory2Service.add(baseCategory2));
    }

    /*
        修改
     */
    @PutMapping("/update2")
    public Result update(@RequestBody BaseCategory2 baseCategory2){
        return Result.ok(baseCategory2Service.update(baseCategory2));
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete2/{id}")
    public Result<Integer> delete(@PathVariable(value = "id") Long id){
        return Result.ok(baseCategory2Service.deleteById(id)) ;
    }

    /**
     * 条件查询
     * @param baseCategory2
     * @return
     */
    @PostMapping(value = "/search")
    public Result search(@RequestBody BaseCategory2 baseCategory2){
        return Result.ok(baseCategory2Service.search(baseCategory2));
    }

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value = "/page/{page}/{size}")
    public Result page(@PathVariable(value = "page") Integer page,
                       @PathVariable(value = "size") Integer size
                       ){
        return Result.ok(baseCategory2Service.page(page,size));

    }

    /**
     * 分页条件查询
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/page/{page}/{size}")
    public Result page(@PathVariable(value = "page") Integer page,
                       @PathVariable(value = "size") Integer size,
                       @RequestBody BaseCategory2 baseCategory2){
        return Result.ok(baseCategory2Service.page(page,size,baseCategory2));

    }


}
