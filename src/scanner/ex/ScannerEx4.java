package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 단을 원하시나요 : ");
        int n = scanner.nextInt();

        System.out.println(n + "단");
        for (int i = 1 ; i <= 9; i++ ){
            int multi = n * i;
            System.out.println(n + "x" + i + "=" + multi );
        }
    }
}
