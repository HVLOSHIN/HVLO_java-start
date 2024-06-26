package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("입력한 숫자 " + num + " 은(는) 짝수입니다.");
        }
        else if(num % 2 == 1){
            System.out.println("입력한 숫자 " + num + " 은(는) 홀수입니다.");
        }
        else {
            System.out.println("짝수나 홀수도 아닙니다");
        }
    }
}
