package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("상품의 가격과 수량을 입력하세요");
        while (true) {
            System.out.print("가격 (-1을 입력하면 종료) : ");
            int price = input.nextInt();
            if (price == -1 ){
                System.out.println("종료...");
                break;
            }

            System.out.print("수량 : ");
            int quantity = input.nextInt();
            int multi = price * quantity;
            System.out.println("총 비용 : " + multi + " 원");

        }
    }
}
