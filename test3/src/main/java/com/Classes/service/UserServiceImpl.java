package com.Classes.service;

import com.Classes.dao.UserDao;
// import com.Classes.dao.UserOracleImpl;
// import com.Classes.dao.UserDaoMysql;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
