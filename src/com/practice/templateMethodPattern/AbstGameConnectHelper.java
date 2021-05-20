package com.practice.templateMethodPattern;

import java.util.NoSuchElementException;

public abstract class AbstGameConnectHelper {

    //보안과정
    protected abstract String doSecurity(String string);

    //인증과정
    protected abstract boolean authentication(String id, String password);


    //권한과정
    protected abstract int authorization(String username);

    //접속 과정
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo) {
        //보안 과정 (암호화된 문자열을 복호화)
        String decodedInfo = doSecurity(encodedInfo);

        String id = "id";
        String password = "password";
        //인증 과정 (아이디 비번 입력)
        if(!authentication(id, password))
            throw new NoSuchElementException("암호 불일치");

        String username = "username";
        //권한 과정
        authorization(username);

        //접속 과정
        return connection(decodedInfo);
    }
}
