package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number);
        printNumber((int) number);
    }
    public static void printNumber(int n){      //숫자만 입력받고, 반환값은 없음
        System.out.println("숫자 : " + n);    //int를 double로 받을수없음
    }
}
