package operator;

public class Comp1  {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b); // 둘은 다르므로 false 출력
        System.out.println(a != b); // 둘은 다르므로 true 출력
        System.out.println(a > b);  // a가 더 작으므로 false 출력
        System.out.println(a < b);  // a가 더 작으므로 true 출력
        System.out.println(a <= b);
        System.out.println(a >= b);

        // 결과를 boolean 변수에 담을
        boolean result = a == b;
        System.out.println("result = " + result);
         
    }
}
