package com.p11_abstract_factory_pattern.database_abstract_factory;

/**
 * Created by yangyue on 2017/3/6.
 */
public class _Init_ {
    public static void main(String[] args) {
        User user = new User(1,"mason");
        UserDaoFactory userDaoMysqlFactory= new UserDaoMysqlFactory();
        UserDaoFactory userDaoAccessFactory = new UserDaoAccessFactory();
        UserDao userDaoMysql = userDaoMysqlFactory.getUserDao();
        UserDao userDaoAccess = userDaoAccessFactory.getUserDao();
        userDaoMysql.add(user);
        userDaoAccess.add(user);
    }
}
