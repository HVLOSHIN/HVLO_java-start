package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 5;
        int coupon = 0;
        if (grade == 1){
            coupon += 1000;
        }
        else if (grade == 2) {
            coupon += 2000;
        }
        else if (grade == 3) {
            coupon += 3000;
        }
        else{
            coupon += 500;
        }
        System.out.println("회원님의 등급은 "+ grade + " 등급이고, " + "회원님의 쿠폰은 " + coupon + " 원 입니다" );
    }
}
