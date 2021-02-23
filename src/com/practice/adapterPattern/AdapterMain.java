package com.practice.adapterPattern;

public class AdapterMain {

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(50f));
    }
}
