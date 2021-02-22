package com.practice.strategyPattern;

/**
 * (무기) 검
 */
public class Sword implements Weapon{


    /**
     * 검으로 공격
     */
    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}
