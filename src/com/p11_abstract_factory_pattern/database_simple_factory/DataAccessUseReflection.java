package com.p11_abstract_factory_pattern.database_simple_factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by yangyue on 2017/3/6.
 */
public class DataAccessUseReflection {
    private static final String PACKAGE = "com.p11_abstract_factory_pattern.database_simple_factory";
    private static final String MODEL = "UserDaoImp";

    public static UserDao getUserDao() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        InputStream ins = new FileInputStream(System.getProperty ("user.dir")+"/conf/p11/database.properties");
        Properties properties = new Properties();
        properties.load(ins);
        String className = PACKAGE+"."+ MODEL + properties.getProperty("database");
        UserDao userDao = (UserDao) Class.forName(className).newInstance();
        return userDao;
    }
}
