package com.neuedu.service.impl;

import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.pojo.UserExample;
import com.neuedu.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> getUser(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPasswordEqualTo(user.getPassword()).andUsernameEqualTo(user.getUsername());
        return userMapper.selectByExample(userExample);
    }
}
