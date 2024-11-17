/* 예제 3-13 */
/* 여러 개의 실수를 main() 메소드 인자로 전달받아 평균값을 구하는 프로그램을 작성하라. */
/* intelliJ 인자 받는 방법 */
/* 메뉴 > 실행 > 구성편집 */
/* 실행을 원하는 java 애플리케이션 선택 > 프로그램 인수 칸에 인자 입력 */
/* 참고 : https://wonderson.tistory.com/327 */

public class MainParameter {
    public static void main(String[] args) {
        double sum = 0;

        for( int i = 0 ; i < args.length ; i++ ) {
            /* 문자열을 실수(double 타입)로 변환하여, 합산 */
            sum += Double.parseDouble(args[i]);
        }

        System.out.println("메소드 인자 합계 값 " + sum + " 입니다.");
        System.out.println("메소드 인자 평균 값 " + sum/args.length + " 입니다.");
    }
}
