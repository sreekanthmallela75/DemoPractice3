package com.strings;

public class Practice3<T> {
    public void method(T[] arr){
        for (T s: arr){
            System.out.println(s + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] integers ={1,2,3};
        String [] strings = {"Sreekanth", "Ram", "Raj"};
        Practice3 practice3 = new Practice3();
        practice3.method(integers);
        System.out.println();
        practice3.method(strings);
    }

}
