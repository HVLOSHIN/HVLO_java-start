package array.ex;

import java.util.Scanner;

public class ArratEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수 : ");
        int count = scanner.nextInt();
        System.out.println(count + "개의 정수를 입력하세요");

        int[] numbers = new int[count];
        int minNum = 0;
        int maxNum = 0;

        for(int i = 0; i < count; i++){
        numbers[i] = scanner.nextInt();
        if(i==0) {
            minNum = numbers[0];
            minNum = numbers[0];
        }
        else{
            if(minNum > numbers[i]){
                minNum = numbers[i];
            }
            if(maxNum < numbers[i]){
                maxNum = numbers[i];
            }
        }
        }
        System.out.println("가장 큰 수 : " + maxNum);
        System.out.println("가장 작은 수 : " + minNum);
    }
}
