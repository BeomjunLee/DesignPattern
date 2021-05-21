package com.practice.factoryMethodPattern;

public class HpCreator extends ItemCreator{
    @Override
    protected void requestItemInfo() {
        System.out.println("DB 에서 회복물약 정보 가져오기");
    }

    @Override
    protected void createItemLog() {
        System.out.println("회복 물약 정보의 로그를 만듭니다");
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
