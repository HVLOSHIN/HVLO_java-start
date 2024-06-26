package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 75;
        System.out.println("score = " + score);
        System.out.println("학점은 ");
        if (90 <=score){
            System.out.println("A");
        }
        else if (80 <= score) {
            System.out.println("B");
        }
        else if (70 <= score) {
            System.out.println("C");
        }
        else if (60 <= score) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        System.out.println("입니다");
    }
}
