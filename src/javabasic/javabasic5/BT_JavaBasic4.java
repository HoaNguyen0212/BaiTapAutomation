package javabasic.javabasic5;

import java.util.ArrayList;
import java.util.List;

public class BT_JavaBasic4 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
        System.out.println("Các số chẵn từ 0 đến 50 là");
        System.out.println(arrayList);

    }
}
