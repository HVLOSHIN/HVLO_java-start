package loop;

public class Continue {

    public static void main(String[] args) {
        int i = 1;
        int endNum = 5;
        while (i <= endNum){
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }}
