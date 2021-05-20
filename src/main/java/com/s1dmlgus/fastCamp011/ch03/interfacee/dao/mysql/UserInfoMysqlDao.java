package com.s1dmlgus.fastCamp011.ch03.interfacee.dao.mysql;

import com.s1dmlgus.fastCamp011.ch03.interfacee.UserInfo;
import com.s1dmlgus.fastCamp011.ch03.interfacee.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL userId =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySQL userId =" + userInfo.getUserId());
    }
}
