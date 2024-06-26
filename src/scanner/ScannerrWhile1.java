package scanner;

import java.util.Scanner;

public class ScannerrWhile1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        while (true){
            System.out.print("문자를 입력하세요(exit: 종료) : ");
            String str = Scanner.nextLine();

            if(str.equals("exit") ){
                System.out.println("종료합니다...");
                break;
            }
        }
    }
}
