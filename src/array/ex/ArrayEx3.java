package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers;
        numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        for(int i = 4; i > i - numbers.length; i--){
            if(i == 0 ){
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i]);
            System.out.print( ", ");
        }
    }
}
