package com.practice.adapterPattern;

/**
 * 예제에 필요한 연산이 들어있는 Math 클래스 (라이브러리라고 가정)
 */
public class Math {

    /**
     * 두배
     * @param num 입력 값
     * @return 입력 값 * 2
     */
    public static double twoTime(double num) {
        return num*2;
    }

    /**
     * 절반
     * @param num 입력 값
     * @return 입력 값 / 2
     */
    public static double half(double num) {
        return num/2;
    }

    /**
     * 강화된 알고리즘 예시 (두배 메서드가 변경됨)
     * @param d 입력 값
     * @return 입력 값 * 2
     */
    public static Double doubled(Double d) {
        return d*2;
    }
}
