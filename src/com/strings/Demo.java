package com.strings;

public class Demo {
    public static void main(String[] args) {
        String str = "s0r000e00e";
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == '0'){
             continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}
