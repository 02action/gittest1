/* 예제 3-14 */
/* try-catch 문을 이용하여, 정수를 0으로 나루려고 할 때, "0으로 나울 수 없습니다." 라는 경고 메세지를 출력하도록 프로그램을 작성하라. */

import java.util.Scanner;

public class ExceptionExample2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int divisor = 0;
        int dividend = 0;

        System.out.print("나뉨수를 입력하시오 : ");
        dividend = in.nextInt();

        System.out.print("나눗수를 입력하시오 : ");
        divisor = in.nextInt();

        try {
            System.out.println(dividend + "를 " + divisor +"로 나누면 " + dividend/divisor + " 입니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

}
