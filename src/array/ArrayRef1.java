package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        int x = 5;
        students = new int[x];

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0 ; i < students.length; i++ ) {
            System.out.println("학생 " + (i+1) + " 점수 " + students[i]);
        }
    }
}
