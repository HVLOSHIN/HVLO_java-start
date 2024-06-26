package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2 ;
        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);
        //뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff );
        // 곱셈
        int multi = a * b;
        // 나눗셈
        System.out.println("a * b = " + multi);
        int div = a / b;
        System.out.println("a / b = "+ div); // 나머지는 버려짐
        // 나머지
        int mod = a % b;
        System.out.println("a % b = "+ mod); // 5나누기 2 하면 2(몫)와 1/2가 나오므로 1이 출력됨
    }
}
