package com.cemserit.java7;

/**
 * Created by cemserit on 2019-06-15.
 */
public class MultiCatch {

    private static int numbers[] = new int[5];

    public static void main(String[] args) {
        try {
            int result = 100 / 0;
            System.out.println("Result: " + result);
            System.out.println(numbers[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
