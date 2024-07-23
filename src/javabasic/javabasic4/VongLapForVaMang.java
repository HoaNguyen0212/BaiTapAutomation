package javabasic.javabasic4;

public class VongLapForVaMang {
    public static void main(String[] args) {
        int array[]  = new int[26];
        int index = 0;
        System.out.println("Các số chẵn từ 0 đến 50:");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
                array[index++]=i;
            }
        }
        System.out.println("\nMảng chứa các số chẵn từ 0 đến 50:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +" ");
        }

    }
}
