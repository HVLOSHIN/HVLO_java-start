package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (9 >= rating){
            System.out.println("어바웃 타임을 추천합니다");
        }
        if (8 >= rating){
            System.out.println("토이스토리를 추천합니다");
        }
        if (7 >= rating){
            System.out.println("고질라를 추천합니다");
        }
    }
}
