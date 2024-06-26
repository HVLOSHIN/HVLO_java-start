package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intVal = 10;
        long longVal;
        double doubleVal;

        longVal = intVal; // int -> long
        System.out.println("longVal = " + longVal);
        doubleVal = intVal; // int -> double
        System.out.println("doubleVal = " + doubleVal);
        doubleVal = 20L; // long -> double
        System.out.println("doubleVal = " + doubleVal);
    }
}
