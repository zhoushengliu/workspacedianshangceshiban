package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.BaseCategory2;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.aspectj.apache.bcel.generic.LineNumberGen;

import java.util.List;

/**
 * @author 琉
 * @create 2021-12-16 22:58
 */
public interface BaseCategory2Service {
    /**
     * 根据id查询二级分类
     * @param id
     * @return
     */
    public BaseCategory2 getById(Long id);

    /**
     * 查询全部二级分类
     * @return
     */
    public List<BaseCategory2> getAll();

    /**
     * 新增
     * @return
     */
    public int add(BaseCategory2 baseCategory2);

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteById(Long id);

    /**
     * 修改
     * @param baseCategory2
     * @return
     */
    public int update(BaseCategory2 baseCategory2);

    /**
     * 条件查询
     * @param baseCategory2
     * @return
     */
    public List<BaseCategory2> search(BaseCategory2 baseCategory2);


    /**
     * 分页查询
     * @param page 当前页码
     * @param size 每页显示数据量
     * @return
     */
    public IPage<BaseCategory2> page(Integer page, Integer size);

    /**
     * 分页条件查询
     * @param page
     * @param size
     * @param baseCategory2
     * @return
     */
    public IPage<BaseCategory2> page
            (Integer page, Integer size,BaseCategory2 baseCategory2);

}
