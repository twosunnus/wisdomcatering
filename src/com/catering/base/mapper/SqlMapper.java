package com.catering.base.mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 所有的Mapper继承这个接口
 *
 * @author: sunqichang
 * @Date: 14-3-8
 * @Time: 下午6:56
 */
public interface SqlMapper<T> {
    public Integer insertEntity(T entity);

    public Integer deleteEntityById(Integer id);

    public Integer updateEntity(T entity);

    public T findEntityById(Integer id);

    public List<T> findEntityList();
}
