package com.s1dmlgus.fastCamp011.ch03.interfacee.web;

import com.s1dmlgus.fastCamp011.ch03.interfacee.UserInfo;
import com.s1dmlgus.fastCamp011.ch03.interfacee.dao.UserInfoDao;
import com.s1dmlgus.fastCamp011.ch03.interfacee.dao.mysql.UserInfoMysqlDao;
import com.s1dmlgus.fastCamp011.ch03.interfacee.dao.oracle.UserInfoOracleDao;

import java.io.*;
import java.util.*;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties();
        prop.load(fis);


        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(220L);
        userInfo.setPw("1234");
        userInfo.setPw("s1dmlgus");

        UserInfoDao userInfoDao = null;


        String dbtype = prop.getProperty("DBTYPE");

        if (dbtype.equals("ORACLE")) {
             userInfoDao = new UserInfoOracleDao();
        } else if (dbtype.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();

        }else {

            System.out.println(" db error");
            return;
        }


        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);


    }
}
