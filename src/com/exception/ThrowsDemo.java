package com.exception;

import java.io.IOException;

public class ThrowsDemo {
    public static void method()throws ArithmeticException, IOException {
        int a = 25/5;
        System.out.println(a);
        throw new IOException("hi");

    }

    public static void main(String[] args) throws ArithmeticException,IOException {
        try {
            method();
        }
        catch (ArithmeticException e){
            System.out.println();
        }
        catch (IOException e){
            System.out.println("Sreekanth Mallela");
        }
    }
}
