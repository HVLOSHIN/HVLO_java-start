package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 15000;
        int age = 11;
        int discount = 0;
        System.out.println("Original price = " + price);

        if(10000 <= price){
            discount += 1000;
        }

        if(age <= 10){
            discount += 1000;
        }
        System.out.println("discount = " + discount);
        price = price - discount;
        System.out.println("price = " + price);
    }
}
