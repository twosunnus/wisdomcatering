package com.catering.common.service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: sunqichang
 * @Date: 14-3-8
 * @Time: 上午12:37
 */
public interface CommonService<T> {
    public Integer insertEntity(T entity);

    public List<T> findEntityList();
}
