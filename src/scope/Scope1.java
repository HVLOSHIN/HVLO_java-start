package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 셍존시작
        if (true){
            int x = 20; //x 생존시작
            System.out.println("if m = " + m );
            System.out.println("if x = " + x );
        }// x 생존종료
        System.out.println("if m = " + m );
        //System.out.println("if x = " + x );  //x는 죽었다
    } //m 생존종료
      // System.out.println("if m = " + m );   //m도 죽었다
}
