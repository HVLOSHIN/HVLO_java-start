package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        multiPrint(3);
        multiPrint(5);
        multiPrint(7);

    }
    public static void  multiPrint(int a){
        String message = "hello world!";
        for (int i = 0; i < a; i++){
            System.out.println(message);
        }
        System.out.println(a + " 번 반복함" );
    }
}
