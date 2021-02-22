package com.practice.strategyPattern;

/**
 * 게임 캐릭터
 */
public class GameCharacter {

    /**
     * 접근점
     */
    private Weapon weapon;

    /**
     * Setter 주입(교환 가능)
     * @param weapon 무기
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * 공격 하기
     */
    public void attack() {
        //Weapon 주입 안됐을시 맨손 공격
        if(weapon == null){
            System.out.println("맨손 공격");
            return;
        }
        //델리게이트
        weapon.attack();
    }
}
