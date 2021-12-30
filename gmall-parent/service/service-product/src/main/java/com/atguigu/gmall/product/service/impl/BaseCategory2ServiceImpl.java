package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.product.mapper.BaseCategory2Mapper;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 琉
 * @create 2021-12-16 23:04
 */
@Service
public class BaseCategory2ServiceImpl implements BaseCategory2Service {

    @Resource
    private BaseCategory2Mapper baseCategory2Mapper;

    /**
     * 根据id查询二级分类
     *
     * @param id
     * @return
     */
    @Override
    public BaseCategory2 getById(Long id) {
        return baseCategory2Mapper.selectById(id);
    }

    /**
     * 查询全部二级分类
     *
     * @return
     */
    @Override
    public List<BaseCategory2> getAll() {
        return baseCategory2Mapper.selectList(null);

    }

    /**
     * 新增
     *
     * @param baseCategory2
     * @return
     */
    @Override
    public int add(BaseCategory2 baseCategory2) {
        return baseCategory2Mapper.insert(baseCategory2);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(Long id) {
        return baseCategory2Mapper.deleteById(id);
    }

    /**
     * 修改
     *
     * @param baseCategory2
     * @return
     */
    @Override
    public int update(BaseCategory2 baseCategory2) {
        return baseCategory2Mapper.updateById(baseCategory2);

    }

    /**
     * 条件查询
     *
     * @param baseCategory2
     * @return
     */
    @Override
    public List<BaseCategory2> search(BaseCategory2 baseCategory2) {
        //参数校验,判个非空
        if(baseCategory2 == null){
            return baseCategory2Mapper.selectList(null);
        }
        //构建查询条件
        LambdaQueryWrapper<BaseCategory2> wrapper = buildQueryParam(baseCategory2);

        //执行查询
        List<BaseCategory2> list = baseCategory2Mapper.selectList(wrapper);

        //返回结果
        return list;

    }

    /**
     * 构建查询条件的私有方法
     * @param baseCategory2
     * @return
     */
    private LambdaQueryWrapper<BaseCategory2> buildQueryParam(BaseCategory2 baseCategory2) {
        //声明条件构造器
        LambdaQueryWrapper<BaseCategory2> wrapper = new LambdaQueryWrapper<>();
        //拼接条件:id不为空的时候
        if(baseCategory2.getId() != null){
            wrapper.eq(BaseCategory2::getId,baseCategory2.getId());
        }
        //name不为空
        if(!StringUtils.isEmpty(baseCategory2.getName())){
            wrapper.like(BaseCategory2::getName,baseCategory2.getName());
        }
        //判断一级分类的id不为空这两种方式都可以
        //category1_id不为空
        if(!StringUtils.isEmpty(baseCategory2.getCategory1Id())){
            wrapper.eq(BaseCategory2::getCategory1Id,baseCategory2.getCategory1Id());
        }
//        if(baseCategory2.getCategory1Id() != null){
//            wrapper.eq(BaseCategory2::getCategory1Id,baseCategory2.getCategory1Id());
//        }



        //返回结果
        return wrapper;

    }

    /**
     * 分页查询
     *
     * @param page 当前页码
     * @param size 每页显示数据量
     * @return
     */
    @Override
    public IPage<BaseCategory2> page(Integer page, Integer size) {
        //参数校验
        if(page == null || size == null){
            return  null;
        }

        //执行查询(单纯分页查询没有条件为null)
        IPage<BaseCategory2> baseCategory2IPage =
                baseCategory2Mapper.selectPage(new Page<>(page, size), null);

        //返回结果
        return baseCategory2IPage;
    }

    /**
     * 分页条件查询
     *
     * @param page 当前页码
     * @param size 每页显示数据量
     * @return
     */
    @Override
    public IPage<BaseCategory2> page(Integer page,
                                     Integer size,
                                     BaseCategory2 baseCategory2) {
        //参数校验
        if(page == null || size == null || baseCategory2 == null){
            return  null;
        }

        //构建查询条件
        LambdaQueryWrapper wrapper = buildQueryParam(baseCategory2);

        //执行查询(单纯分页查询没有条件为null)
        IPage<BaseCategory2> baseCategory2IPage =
                baseCategory2Mapper.selectPage(new Page<>(page, size), wrapper);

        //返回结果
        return baseCategory2IPage;
    }

}
