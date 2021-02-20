package com.practice.strategyPattern;

public class StrategyMain {

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        
        //Weapon 주입 X
        character.attack();
        
        //Sword 주입
        character.setWeapon(new Sword());
        character.attack();
        
        //Gun 주입
        character.setWeapon(new Gun());
        character.attack();
    }
}
