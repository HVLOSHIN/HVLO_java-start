package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        while(true){

            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력 하세요 : ");
            int num = input.nextInt();
            if (num == -1 ){
                System.out.println("입력을 중단합니다.");
                System.out.println("합계 : " + sum );
                System.out.println("평균 : " + ( sum / count));
                break;
            }
            count++;
            sum += num;
        }
    }
}
