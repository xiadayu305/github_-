package cn.ustc.service.impl;

import cn.ustc.dao.BookDao;
import cn.ustc.dao.UserDao;
import cn.ustc.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private BookDao bookDao;
    private int age;
    private String name;

    public UserServiceImpl(){

    }
    public UserServiceImpl(UserDao userDao, int age, String name) {
        this.userDao = userDao;
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("userService running..."+"name:"+name+"  age:"+age);
        userDao.save();
        bookDao.save();
    }
}
