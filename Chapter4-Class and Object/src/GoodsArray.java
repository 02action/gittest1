/* 예제 4-3 */
/* 상품을 입력받아 Goods 객체를 생성하고 이들을 Goods 객체 배열에 저장하라. */

import java.util.Scanner;

public class GoodsArray {
    public static void main(String[] args) {
        Goods2 [] goodsArray;
        goodsArray = new Goods2[3];

        Scanner s = new Scanner(System.in);

        for(int i = 0 ; i < goodsArray.length ; i++) {
            String name = s.next();
            int price = s.nextInt();
            int n = s.nextInt();
            int sold = s.nextInt();

            goodsArray[i] = new Goods2(name, price, n, sold);
        }

        for(int i = 0; i < goodsArray.length ; i++) {
            System.out.print(goodsArray[i].getName() + " ");
            System.out.print(goodsArray[i].getPrice() + " ");
            System.out.print(goodsArray[i].getNumberOfStocket() + " ");
            System.out.println(goodsArray[i].getSold());
        }
    }

}

class Goods2 {
    private String name;
    private int price;
    private int numberOfStock;
    private int sold;

    Goods2(String n, int p, int nStock, int s) {
        name = n;
        price = p;
        numberOfStock = nStock;
        sold = s;
    }

    String getName() {
        return name;
    }
    int getPrice() {
        return price;
    }
    int getNumberOfStocket() {
        return numberOfStock;
    }
    int getSold() {
        return sold;
    }

}
