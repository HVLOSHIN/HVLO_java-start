package loop;

public class While2_1 {
    public static void main(String[] args) {
        int x = 1;
        int sum= 0;
        while (x<5){
            sum = sum + x;
            x += 1;
        }
        System.out.println(sum);
    }
}
