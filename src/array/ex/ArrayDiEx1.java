package array.ex;

public class ArrayDiEx1 {
    public static void main(String[] args) {
        int[][] arr =  new int[][]{
                {100,80,70},
                {30,40,50},
                {60,70,50},
                {90,100,80}
        };
        int total = 0;
        double average;
        for (int row = 0; row < arr.length; row++){
            for (int colum = 0; colum < arr[row].length; colum++){
            total += arr[row][colum];
            }
            average = (double) total / 3;
            System.out.println(row + "번 학생의 총점 : " + total + ", 평균 : " + average);
            total = 0;
        }
    }
}
