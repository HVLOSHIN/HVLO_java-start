package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요");
        int[] numbers;
        numbers = new int[5];
        int total = 0;
        double average;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }
        average = (double) total / numbers.length;
        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);
    }
}
