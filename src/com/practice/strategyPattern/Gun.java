package com.practice.strategyPattern;

/**
 * (무기) 총
 */
public class Gun implements Weapon{

    /**
     * 총으로 공격
     */
    @Override
    public void attack() {
        System.out.println("총 공격"); 
    }
}
