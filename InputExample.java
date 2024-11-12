import java.io.*; /* InputStreamReader 사용을 위한 import */

public class InputExample {

    public static void main(String args[]) {
        InputStreamReader rd = new InputStreamReader(System.in);

        try {
            while(true) {
                int a = rd.read();

                if (a==-1)
                    break;

                System.out.print((char) a);
            }
        }
        catch (IOException e) {
            System.out.println("입력 오류 발생");
        }
    }
}
