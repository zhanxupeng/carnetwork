package com.mr.service.common;


import com.mr.common.base.BaseModel;

import java.util.List;

public interface IBaseDBService<T extends BaseModel> {

    /**
     * 根据ID查询对象
     */
    T selectById(Integer id);

    /**
     * 新增
     */
    int insert(T entity);

    /**
     * 更新
     */
    int update(T entity);

    /**
     * 批量删除
     */
    int delete(List<Integer> idList);

    /**
     * 删除（单个）
     */
    int delete(Integer id);

}
