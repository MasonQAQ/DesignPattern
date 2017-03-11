package com.p11_abstract_factory_pattern.database_abstract_factory;

/**
 * Created by yangyue on 2017/3/6.
 */
public class UserDaoImpMysql implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("在Mysql中插入新用户:");
        System.out.println(user.toString());
    }

    @Override
    public void get(int id) {
        System.out.println("在Mysql中获取ID为"+id+"的用户");
    }
}
