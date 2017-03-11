package com.p11_abstract_factory_pattern.database_simple_factory;

import java.io.InputStream;

/**
 * Created by yangyue on 2017/3/6.
 */
public class DataAccess {
    private static final String db = "Mysql";
    InputStream ins = this.getClass().getResourceAsStream("");
//    private static final String db = "Access";
    public static UserDao getUserDao(){
        UserDao userDao = null;
        switch (db){
            case "Mysql":
                userDao = new UserDaoImpMysql();
                break;
            case "Access":
                userDao = new UserDaoImpAccess();
                break;
        }
        return userDao;
    }
}
