package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        while (true) {

            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (num == 1){
                System.out.print("상품명을 입력하세요 : ");
                String itemName = scanner.nextLine();
                System.out.print("가격을 입력하세요 : ");
                int itemPrice = scanner.nextInt();
                System.out.print("구매수량을 입력하세요 : ");
                int itemQuant = scanner.nextInt();

                int smallSum = itemPrice * itemQuant;
                totalSum += smallSum;
                System.out.println("상품명 : " + itemName + ", 가격 : " + itemPrice + ", 수량 : " + itemQuant);
                System.out.println("합계 : " + smallSum);
                smallSum = 0;

            }
            else if(num == 2) {
                while (true) {
                    System.out.println("총 결제 금액은 " + totalSum + " 입니다.");
                    System.out.println("1: 결제, 2: 이전화면");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("결제 감사합니다.");
                        totalSum = 0;
                        break;
                    } else if (choice == 2) {
                        break;
                    } else {
                        System.out.println("올바른 옵션을 선택해주세요");
                    }
                }
            }
            else if(num == 3){
                System.out.println("종료...");
                break;
            }
            else{
                System.out.println("올바른 옵션을 선택해주세요");
            }
        }
    }
}
