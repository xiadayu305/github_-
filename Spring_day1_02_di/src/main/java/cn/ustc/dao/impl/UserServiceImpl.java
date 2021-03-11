package cn.ustc.dao.impl;

import cn.ustc.dao.UserDao;

public class UserServiceImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao service running");
    }
}
