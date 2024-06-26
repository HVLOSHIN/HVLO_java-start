package array.ex;

import java.util.Scanner;

public class ArrayDiEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int x = scanner.nextInt(); // x = 학생수
        int[][] scores = new int[x][3];
        String[] subjects = {"국어","영어","수학"}; //열에 이름을 부여

        int[] totals = new int [x];  //총점 배열 선언
        double[] averages = new double[x]; // 평균 배열 선언

        for (int i = 0; i < x; i++){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < 3; j++){
                System.out.print(subjects[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
                totals[i] += scores[i][j];
            }
        }
        for (int i = 0; i < x; i++){
            averages[i] = (double) totals[i] / 3;
            System.out.print((i+1) + "번 학생의 총점 : " + totals[i]);
            System.out.println(", 평균 : " + averages[i]);
        }
    }
}
