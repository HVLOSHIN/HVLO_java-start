package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 0;
        if (0 < dollar){
            dollar *= 1300;
            System.out.println("환전 금액은 " + dollar + "원 입니다.");
        } else if (0 == dollar) {
            System.out.println("환전할 금액이 없습니다");
        }
        else {
            System.out.println("잘못된 금액입니다.");
        }
    }
}
