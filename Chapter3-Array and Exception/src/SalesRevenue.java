/* 예제3-10 */
/* 한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 프로그램을 작성하라. */

public class SalesRevenue {
    public static void main(String[] args) {
        int intArray[][] = { {90, 90, 110, 110}
                            , {120, 110, 100, 110}
                            , {120, 140, 130, 150}
                            };

        double sum = 0;

        for(int i = 0; i < intArray.length ; i++) {
            for(int j = 0 ; j < intArray[i].length ; j++) {
                sum += intArray[i][j];
            } /* for(int j = 0 ; j < intArray[i].length ; j++) */
        } /* for(int i = 0; i < intArray.length ; i++) */

        System.out.println("지난 3년간 매출 총 액은 " + sum + "이며, 연평균 매출은 " + sum/intArray.length + "입니다.");
    }
}
