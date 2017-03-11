package com.p11_abstract_factory_pattern.database_simple_factory;

import java.io.IOException;

/**
 * Created by yangyue on 2017/3/6.
 */
public class _Init_ {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IOException {
        UserDao userDao = DataAccessUseReflection.getUserDao();
        userDao.add(new User(1,"mason"));
        userDao.get(2);
    }
}
