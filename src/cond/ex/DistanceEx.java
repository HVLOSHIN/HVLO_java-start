package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 25;
        System.out.println("distance = " + distance);
        if (distance <= 1){
            System.out.println("걸어가세요");
        }
        else if (distance <= 10) {
            System.out.println("자전거");
        }
        else if (distance <= 100) {
            System.out.println("자동차");
        }
        else {
            System.out.println("비행기");
        }
    }
}
