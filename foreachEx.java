public class foreachEx {
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        int sum = 0;

        /* for each num 합계 출력*/
        for (int k : num)
            sum += k;
        System.out.println("합은 " + sum); /* println 은 뒤에 개행(엔터) 포함 */

        /* 문자열 배열 출력 */
        for (String s : names)
            System.out.print(s + " ");
        System.out.println();

        /* 요일 enum 출력 */
        for (Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();

    }
}
