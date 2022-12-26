package com.exception;

public class CheckedPhoneNumber {
    public static void checkPhoneNumber(String num){
        if (num.length()!=10) {
            throw new RuntimeException("Phone Number is not Correct");
        }else {
            System.out.println("Phone number is correct");
        }
    }

    public static void main(String[] args) {
        checkPhoneNumber("8790662584");
    }
}
