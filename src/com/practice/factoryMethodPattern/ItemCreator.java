package com.practice.factoryMethodPattern;

public abstract class ItemCreator {

    public Item create() {
        Item item;
        requestItemInfo();
        item = createItem();
        createItemLog();
        return item;
    }

    //아이탬을 생성하기전에 DB 에 정보 요청합니다.
    protected abstract void requestItemInfo();

    //아이템을 생성후 로그 남기기
    protected abstract void createItemLog();

    //아이템을 생성하는 알고리즘
    protected abstract Item createItem();

}
