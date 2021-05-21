package com.practice;

import com.practice.templateMethodPattern.DefaultGameConnectHelper;

public class Main {

    public static void main(String[] args) {
        DefaultGameConnectHelper defaultGameConnectHelper = new DefaultGameConnectHelper();
        defaultGameConnectHelper.requestConnection("abc");
    }
}
