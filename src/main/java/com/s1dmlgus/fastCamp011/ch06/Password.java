package com.s1dmlgus.fastCamp011.ch06;

import lombok.Data;

@Data
public class Password {

    private String password;

    public void setPassword(String password) throws PasswordException{

        if (password == null) {
            throw new PasswordException("비밀번호는 null 일 수 없습니다.");
        } else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상이여야 한다");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야한다");
        }

        this.password = password;
    }


    public static void main(String[] args) {

        Password password = new Password();



    }
}
