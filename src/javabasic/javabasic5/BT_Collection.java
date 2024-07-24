package javabasic.javabasic5;

import java.util.ArrayList;
import java.util.List;

public class BT_Collection {
    static List<String> arrayListTT = new ArrayList<>();

     static void thongTin() {
        arrayListTT.add("Nguyễn Thị Hoa");
        arrayListTT.add("02-12-2002");
        arrayListTT.add("Thanh Hóa");
        arrayListTT.add("Tester");
    }

    public static void main(String[] args) {
        thongTin();
        for (int i = 0; i < arrayListTT.size();i++){
            System.out.println(arrayListTT.get(i));
        }

    }
}
