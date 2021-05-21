package com.practice.factoryMethodPattern;

public class HpPotion implements Item{

    @Override
    public void used() {
        System.out.println("체력 회복");
    }
}
