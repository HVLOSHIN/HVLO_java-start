package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요.");
        int tryNumber = scanner.nextInt();
        System.out.println(tryNumber + "개의 정수를 입력하세요.");
        int total = 0;
        double average;
        int[] numbers;
        numbers = new int[tryNumber];
        for(int i = 0; i < tryNumber; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }
        average = (double) total / tryNumber;
        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);
    }
}
