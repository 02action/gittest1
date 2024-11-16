import java.util.Scanner;

/* 5개 입력 받아 그 중 가장 큰 수를 출력 */
public class ArrayAccess {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int intArray[] = new int[5];
        int max = 0;

        for (int i = 0 ; i < 5 ; i++) {
            /* 키보드에서 입력받은 저수를 배열에 저장 */
            intArray[i] = in.nextInt();

            /* 가장 큰 수와 비교하여, 크면 max에 저장 */
            if(intArray[i] > max) {
                max = intArray[i];
            }
        } /* for (int i = 0 ; i < 5 ; i++) */

        System.out.print("입력된 수에서 가장 큰 수는 " + max + " 입니다.");

    }
}
