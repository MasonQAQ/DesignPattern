package com.p11_abstract_factory_pattern.database_abstract_factory;

/**
 * Created by yangyue on 2017/3/6.
 */
public interface UserDao {
    void add(User user);
    void get(int id);
}
