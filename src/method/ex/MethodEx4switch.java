package method.ex;

import java.util.Scanner;

public class MethodEx4switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택 : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    int depositAmount = scanner.nextInt();
                    balance = deposit(balance, depositAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    int withdrawAmount = scanner.nextInt();
                    balance = withdraw(balance, withdrawAmount);
                    break;
                case 3:
                    System.out.println("현재잔액 : " + balance + "원");
                    break;
                case 4:
                    System.out.println("종료...");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }
    public static int deposit(int balance, int depositAmount){    //입금
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금했습니다");
        System.out.println("현재 잔액 : " + balance + " 원");
        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount){    //출금
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금했습니다");
        }
        else {
            System.out.println(withdrawAmount + " 원을 출금하려 했으나, 잔액이 부족합니다.");
        }
        System.out.println("현재 잔액 : " + balance + " 원");
        return balance;
    }
}
