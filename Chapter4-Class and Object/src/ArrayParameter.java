/* 예제 4-4 */
/* char 배열을 메소드의 인자로 전달하여 배열 속의 공백(' ') 문자를 ','로 대치하는 프로그램을 작성하라. */

public class ArrayParameter {
    static void replaceSpace(char a[]) {
        for(int i = 0; i < a.length ; i++) {
            if(a[i] == ' ') {
                a[i] = ',';
            }
        }
    }

    static void printCharArray(char a[]) {
        for (int i = 0 ; i < a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        char c[] = {'T', 'h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};

        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
