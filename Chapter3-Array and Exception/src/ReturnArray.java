/* 예제 3-12 */
/* 배열을 생성하고 각 원소 값을 출력하는 프로그램을 작성하라 */

public class ReturnArray {
    static int[] makeArray() {
        int tmpArray[] = new int[4];

        for(int i = 0 ; i < tmpArray.length ; i++) {
            tmpArray[i] = i;
        }

        return tmpArray;

    } /* makeArray() */

    public static void main(String[] args) {
        int intArray[] = makeArray();

        for(int i = 0 ; i < intArray.length ; i++ ) {
            System.out.println(intArray[i]);
        }
    }
}
