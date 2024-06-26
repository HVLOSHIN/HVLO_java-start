package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력하세요 : ");
        int firstValue = scanner.nextInt();
        System.out.println(firstValue + " 을(를) 입력하셨습니다.");

        System.out.print("두번째 숫자를 입력하세요 : ");
        int secondValue = scanner.nextInt();
        System.out.println(secondValue + " 을(를) 입력하셨습니다.");

        int sum = firstValue + secondValue;
        System.out.println("결과 : = " + sum);
    }
}
