package com.arrays;

import java.util.ArrayList;

public class ArrayDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int i;
        for (i = 0; i <= 100;i++){
            arrayList.add(i);

        }
        System.out.println("numbers" + arrayList);
        System.out.println();
        ArrayDemo1 arrayDemo1 = new ArrayDemo1();
        arrayDemo1.filterEven(arrayList,arrayList1);
    }

    public void filterEven(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
        for (int i=0; i<arrayList.size(); i++){
            if (i%2==0){
            arrayList1.add(i);
            }
        }
        System.out.println("Even numbers" + arrayList1);

    }
}
