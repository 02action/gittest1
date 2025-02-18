/* 예제 3-16 */
/* 문자열을 정수로 변환할 때 발생하는 NumberFormatException을 처리하는 프로그램을 작성하아. */

public class NumException {

    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "998", "3.141592"};

        try {
            for(int i = 0 ; i < stringNumber.length ; i++) {
                int j = Integer.parseInt(stringNumber[i]);
                System.out.println("숫자로 변환된 값은 " +j);
            }
        } catch (NumberFormatException e) {
            System.out.println("정수로 변환할 수 없습니다.");
            //throw new RuntimeException(e);
        }

    }

}
