package com.practice.adapterPattern;

/**
 * 인터페이스 구현 클래스(요구사항에 맞춰서 Math 를 변경하는 class)
 */
public class AdapterImpl implements Adapter{


    /**
     *  두배
     * @param f 입력 값
     */
//    @Override
//    public Float twiceOf(Float f) {
//        return (float)Math.twoTime(f.doubleValue());
//    }

    /**
     * 절반
     * @param f 입력 값
     */
    @Override
    public Float halfOf(Float f) {
        return (float)Math.half(f.doubleValue());
    }

    /**
     *  두배(알고리즘만 변경)
     * @param f 입력 값
     */
    @Override
    public Float twiceOf(Float f) {
        //로그 삽입 가능
        //Math를 사용하는 구현체를 만들어서 변경시켜 사용
        return Math.doubled(f.doubleValue()).floatValue();
    }
}
