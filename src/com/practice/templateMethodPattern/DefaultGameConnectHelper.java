package com.practice.templateMethodPattern;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 비번 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("권한확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
