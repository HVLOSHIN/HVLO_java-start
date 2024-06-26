package method.ex;

import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int balance = 10000;
        balance = deposit(balance,1000); //1000원 입금
        balance = withdraw(balance,12000); //2000원 출금
    }
    public static int deposit(int balance, int depositAmount){    //입금
        balance += depositAmount;
        System.out.println("현재 잔액 : " + balance + " 원");
        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount){    //출금
        balance -= withdrawAmount;
        if (balance < 0){
            System.out.println(withdrawAmount + " 원을 출금하려 했으나, 잔액이 부족합니다.");
            balance += withdrawAmount; //출금 취소.
        }
        System.out.println("현재 잔액 : " + balance + " 원");
        return balance;
    }
}
