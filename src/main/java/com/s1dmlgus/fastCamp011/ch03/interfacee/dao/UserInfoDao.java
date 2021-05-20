package com.s1dmlgus.fastCamp011.ch03.interfacee.dao;

import com.s1dmlgus.fastCamp011.ch03.interfacee.UserInfo;

public interface UserInfoDao {

    /**
     * UserInfo를 연결할 때
     * 구현해야 할 기능은 아래와 같다.(선언) -> 명세
     */

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);


}
