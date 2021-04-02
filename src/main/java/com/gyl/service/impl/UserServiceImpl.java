package com.gyl.service.impl;

import com.gyl.mapper.UserMapper;
import com.gyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 高云雷
 * @date 2021-04-2021/4/2 10:24:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper  userMapper;
    @Override
    @Transactional
    public void tranfor() {
        //更新一条数据
        int updateCount = userMapper.update("张三待删除", "2");


        //抛出异常
        System.out.println("修改成功"+updateCount+"条，即将执行删除");
        //删除一条数据
        int deleteCount = userMapper.delete("2");
        System.out.println("删除 " + deleteCount + " 条");
    }
}
