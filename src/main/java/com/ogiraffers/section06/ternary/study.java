package com.ogiraffers.section06.ternary;

public class study {

    public static void main(String[] args) {

        /* Application01
         * 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int num1 =20;
        int num2 = 30;

        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;

        System.out.println(" 더하기 결과 : " +  result1);
        System.out.println(" 빼기 결과 : " +  result2);
        System.out.println(" 곱하기 결과 : " +  result3);
        System.out.println(" 나누기 한 몫 : " +  result4);
        System.out.println(" 나누기한 나머지 : " +  result5);

        /* Application02
         * 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */

        double nerbi = 12.5;
        double hight = 36.4;

        double result6 = nerbi * hight;
        double result7 = (nerbi + hight) * 2;

        System.out.println("면적 : " + result6 );
        System.out.println("둘레 : " + result7 );


        /* Application01
         * 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */

        char num3 = 'a';

        System.out.println("문자 a의 unicode = " + (int) num3);


        /* Application02
         * 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        double language = 80.5;
        double math = 50.6;
        double english = 70.8;

        double result8 = (int) (language + math + english);
        double result9 = (int) (language + math + english) /3 ;

        System.out.println("총점 = " + result8);
        System.out.println("평균 = " + result9);

        /* 예제 문제를 기재해주세요 */

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65


		System.out.println(y >= 5 || x < 0 && x > 2);   //true
		System.out.println(y += 10 - x++);   // y 13 x3
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') );  //f
		System.out.println('C'-c);  //2
		System.out.println('5'-'0');  //x=5  2-0=2
		System.out.println(c+1);  //66
		System.out.println(++c); //B
		System.out.println(c++); //66 ->B
		System.out.println(c); //67



		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/

        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         *
         *
         * int apple = 92;
         * int bagu = (apple  % 10 )
         */
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1: 0);  //나머지가 있으면 1개의 바구니를 추가해주겟다

        System.out.println(" 필요한 바구니의 수 : " + numOfBucket);

        /* 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
        만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
		int num = 456;
		System.out.println( /* (1) ); */

        int num12 = 456;
        int num13 = 111;


        System.out.println(num12 / 100 * 100) ;
        System.out.println(num13 / 100 * 100);




        /* 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
        (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
		int num = 333;
		System.out.println( /* (1) */

        int num14 =333;
        int num15 =777;
        System.out.println( num14 /100 *100 +31 );
        System.out.println( num15 /100 *100 +71 );



    }
}
