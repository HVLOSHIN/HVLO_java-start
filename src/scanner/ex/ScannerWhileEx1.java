package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("안녕하세요. 이름과 나이를 입력해 주세요. 종료를 치시면 종료됩니다.");
        while(true){

            System.out.print("이름을 입력하세요 : ");
            String name = scanner.nextLine();
            if(name.equals("종료")){
                System.out.println("종료...");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();     // Int정수를 치고 남은 찌꺼기가 있어서 방지용.
            System.out.println("당신의 이름 : " + name + ", 당신의 나이 : " + age);
        }
    }
}
