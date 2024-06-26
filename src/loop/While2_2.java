package loop;

public class While2_2 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        int endNum = 3;
        while (x <= endNum) {
            sum = sum + x;
            System.out.println("x = " + x + ", Sum = " + sum);
            x++;
        }
    }
}
