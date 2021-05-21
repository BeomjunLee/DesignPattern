package com.practice.factoryMethodPattern;

public class MpPotion implements Item{

    @Override
    public void used() {
        System.out.println("마나 회복");
    }
}
