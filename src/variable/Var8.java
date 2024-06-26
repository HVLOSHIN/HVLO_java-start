package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127 까지 저장 가능
        short s = 32767; // -32768 ~ 32767 까지 저장 가능
        int i = 2147483647; // -2147483648 ~ 2147483647 (약 21억)

        long l = 9223372036854775807L; // 존나큼, L을 붙여줘야 한다
        // 높을수록 메모리를 쳐먹는 다는 단점이 있다
        //실수
        float f = 10.0f; // f를 붙여줘야 한다
        double d = 10.0;

    }
}
