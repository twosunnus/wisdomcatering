package com.catering.common.service;

import com.catering.common.mapper.IUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: sunqichang
 * @Date: 14-3-8
 * @Time: 上午12:37
 */
@Service
public class CommonServiceImpl implements CommonService {
    @Resource
    private IUserMapper iUserMapper;

    @Override
    public Integer insertEntity(Object entity) {
        return iUserMapper.insertEntity(entity);
    }

    @Override
    public List findEntityList() {
        return iUserMapper.findEntityList();
    }

}
