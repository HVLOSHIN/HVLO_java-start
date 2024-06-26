package array.ex;

import java.util.Scanner;

public class ArrayDiEx1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어","영어","수학"}; //열에 이름을 부여
        int[] totals = new int[4];
        double[] averages = new double[4];
        int total = 0;
        for (int i = 0 ; i < scores.length; i++){
            System.out.println((i + 1)+ "번 학생의 성적을 입력하세요");
            for (int j = 0; j < scores[i].length;j++){
                System.out.print(subjects[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
                totals [i] += scores[i][j];

            }
        }
        for (int i = 0; i < scores.length; i++){
            averages[i] = (double) totals[i]/3 ;
            System.out.println((i + 1) + "번 학생의 총점 : " + totals[i] + ", 평균 : " + averages[i] );
        }
    }
}
