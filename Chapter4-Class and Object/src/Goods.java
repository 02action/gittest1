/* 예제 4-1 */
/* 상품 하나를 표현하는 클래스 Goods를 작성하라. */

public class Goods {
    String name;
    int price, numberOfStock, sold;


    public static void main(String[] args) {
        Goods camera;
        camera = new Goods();

        camera.name = "Nikon";
        camera.price = 400000;
        camera.numberOfStock = 30;
        camera.sold = 50;

        System.out.println("상품 이름 : " + camera.name);
        System.out.println("상품 가격 : " + camera.price);
        System.out.println("상품 재고 : " + camera.numberOfStock);
        System.out.println("상품 팔린 개수 : " + camera.sold);


    }

}
