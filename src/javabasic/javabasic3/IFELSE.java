package javabasic.javabasic3;

public class IFELSE {
    static int number = 100;

     public static void checkNumber(int n) {
        if (n == number) {
            System.out.println("n bang 100");
        } else if (n < number) {
            System.out.println("m bé hơn 100");
        } else {
            System.out.println("n lớn hơn 100");
        }
    }

    public static void main(String[] args) {

        checkNumber(100);
        checkNumber(50);
        checkNumber(150);

    }
}
