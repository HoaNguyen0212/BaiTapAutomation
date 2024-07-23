package javabasic.javabasic3;

public class OnTap {
    public static void main(String[] args) {
        String name1 = "Hoa";
        String name2 = "Hoaa";
        int age1 = 22;
        int age2 = 24;

        System.out.println((name1.equals(name2))|| (age1 <= age2));

        System.out.println(name1 != name2);

        System.out.println((name1 == name2)&&(age1 == age2));

        System.out.println((name1==name2)||(age1==age2));

        System.out.println(!((name1==name2)||(age1==age2)));

        System.out.println(age1>age2);

        System.out.println(age1<age2);

        System.out.println(age1==age2);

        System.out.println(name2.contains(name1));

        System.out.println(name2.equals(name1));

    }
}
