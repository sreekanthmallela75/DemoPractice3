package com.arrays;

import java.util.ArrayList;

public class ArrayDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            arrayList.add(i);
        }
        System.out.println("numbers" + arrayList);
        System.out.println();
        ArrayDemo3 arrayDemo3 = new ArrayDemo3();
        arrayDemo3.filterPrime(arrayList, arrayList1);
    }

    public void filterPrime(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                arrayList1.add(i);
            }
        }
        System.out.println("Prime nos are" + arrayList1);
    }
}