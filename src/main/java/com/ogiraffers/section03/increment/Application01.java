package com.ogiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. 증감연산자에 대해 이해하고 활용할 수 있다.*/
        /*필기.
        *  증감연산자
        *  - 피연산자의 앞 or 뒤에 사용이 가능하다.
        *  '++' : 1 증가의 의미
        *  '--' : 1 감소의 의미*/

        int num = 20;
        System.out.println(" num = " + num);

        num++;  //1증가
        System.out.println(" num = " + num);

        ++num;  //1증가
        System.out.println(" num = " + num);

        num--;  //1감소
        System.out.println(" num = " + num);

        --num;  //1감소
        System.out.println(" num = " + num);

        /*필기.
        *  주의사항
        *  증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다!!!!
        *  다른 연산자와 함께 사용할 때 증감 연산자의 의미
        *  '++num' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함.
        *  'num++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킨다.*/

        int firstNum = 20;

        int result1 = firstNum++ * 3;  //먼저 리절트1은 60이고, 이후 펄스트넘은 1더해줌

        System.out.println(" result1 = " + result1 );
        System.out.println(" firstNum = " + firstNum );

        int secondNum = 20;

        int result2 = ++secondNum * 3;  // 세컨드넘은 먼저 하나 더해주고 21, 리졀트는 21에 곱하기 3해서 63

        System.out.println(" result2 = " + result2 );
        System.out.println(" secondNum = " + secondNum);

        int num1 = 10;
        int addNum = num1++;  //먼저 10 대입하고 그다음에 num1은 +로 11이 됨.

        System.out.println("addNum = " + addNum);

        System.out.println("num1 = " + num1);

    }
}
