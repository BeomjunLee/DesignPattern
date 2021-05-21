package com.practice.factoryMethodPattern;

public class MpCreator extends ItemCreator{
    @Override
    protected void requestItemInfo() {
        System.out.println("DB 에서 마나물약 정보 가져오기");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마나물약 정보의 로그를 만듭니다");
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
