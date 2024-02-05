package com.ogiraffers.section06.ternary;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. 삼항 연산자에 대해 이해하고 활용할 수 있다.*/
        /*필기.
        *  삼항 연산자.
        *  자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        *  항목이 3개이다. (조건식)? 참일 떄 사용하는 값1 : 거짓일떄 사용하는 값2 */

        /*목차. 1. 삼항연산자 단독 사용*/
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0) ? "양수다, " : "양수가 아니다.";  //true니깐 앞에있는것으로 나옴,
        String result2 = (num2 > 0) ? "양수다." : "양수가 아니다.";

        System.out.println(" result1 = " +result1);
        System.out.println("result2 = " + result2);  //false이면 뒤에값 반환.

        /*목차. 2. 삼항연산자 중첩사용*/
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0) ? "양수다" : (num3 == 0) ? "0이다." : "음수다.";
        String result4 = (num4 > 0) ? "양수다" : (num4 == 0) ? "0이다." : "음수디.";  // 앞에서 f면 뒤에로 그리고 뒤는 t이니깐 0이다 나옴
        String result5 = (num5 > 0) ? "양수다" : (num5 == 0) ? "0이다." : "음수디.";  // 앞에서 f면 뒤에로 그리고 뒤는 t이니깐 0이다 나옴

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);




    }
}
