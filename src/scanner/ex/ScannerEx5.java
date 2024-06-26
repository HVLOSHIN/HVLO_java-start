package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 수 : ");
        int num2 = scanner.nextInt();

        System.out.print("두 숫자 사이의 모둔 정수 : ");
        if (num1 >= num2){
            for(int i = num2 + 1; i < num1; i++){
                if(i == num1 - 1 ){
                    System.out.print(i);
                    break;
                }
                System.out.print(i);
                System.out.print(", ");
            }
        }
        else{
            for(int j = num1 + 1; j < num2; j++){
                if(j == num2 - 1 ){
                    System.out.print(j);
                    break;
                }
                System.out.print(j);
                System.out.print(", ");
            }
        }
    }
}
