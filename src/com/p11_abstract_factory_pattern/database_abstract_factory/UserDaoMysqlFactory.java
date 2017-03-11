package com.p11_abstract_factory_pattern.database_abstract_factory;

/**
 * Created by yangyue on 2017/3/6.
 */
public class UserDaoMysqlFactory implements UserDaoFactory {
    @Override
    public UserDao getUserDao() {
        return new UserDaoImpMysql();
    }
}
