package com.practice.adapterPattern;

/**
 * 요구 사항 interface
 * 1. 수의 두배의 수를 반환 return FLOAT
 * 2. 수의 반의 수를 반환 return FLOAT
 */
public interface Adapter {

    /**
     * 원하는 기능들 
     */
    public Float twiceOf(Float f);
    public Float halfOf(Float f);
}
