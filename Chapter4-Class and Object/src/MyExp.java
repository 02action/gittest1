/* 예제 4-2 */
/* 지수를 표현하는 클래스 MyExp를 작성하라. */

public class MyExp {
    int base;
    int exp;

    int getValue() {
        int res = 1;

        for(int i = 0 ; i < exp ; i++) {
            res *= base;
        }

        return res;
    }


    public static void main (String[] args) {
        MyExp number1 = new MyExp();

        number1.base = 2;
        number1.exp = 3;

        System.out.println("2의 3승 : " + number1.getValue());

    }
}
