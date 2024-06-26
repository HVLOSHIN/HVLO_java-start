package scanner.ex;

import java.util.Scanner;

public class ScannerEx5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 수 : ");
        int num2 = scanner.nextInt();

        System.out.print("두 숫자 사이의 모둔 정수 : ");

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num2 + 1; i < num1; i++ ){
            if(i == num1 - 1 ){
                System.out.print(i);
                break;
            }
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
