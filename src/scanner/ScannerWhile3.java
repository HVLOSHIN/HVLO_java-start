package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요. 0을 입력하면 종료됩니다.");
        int sum = 0;
        while(true){
            System.out.print("정수 입력 : ");
            int num = scanner.nextInt();
            sum += num;

            if (num == 0 ){
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            System.out.println("현재 까지의 총 합은 " + sum + " 입니다.");
        }
    }
}
