import java.util.Scanner;

public class ArrayLength {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int intArray[] = new int[5];
        double sum = 0;

        for (int i = 0 ; i < intArray.length ; i++) {
            /* 키보드에서 입력받은 값 배열에 저장 */
            intArray[i] = in.nextInt();
        } /* for (int i = 0 ; i < intArray.length ; i++) */

        for (int i = 0 ; i < intArray.length ; i++) {
            /* 배열에 저장된 정수 값 더하기 */
            sum += intArray[i];
        } /* for (int i = 0 ; i < intArray.length ; i++) */

        System.out.print("배열 원소의 평균은 " + sum/intArray.length + " 입니다.");
    }
}
