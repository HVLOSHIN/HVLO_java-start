package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleVal = -11.5;
        int intVal;
        // intVal = doubleVal;  //오류발생
        intVal = (int) doubleVal;  // 명시적 형변환
        System.out.println(intVal);
    }
}
