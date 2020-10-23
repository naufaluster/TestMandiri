package com.naufal;

public class NumberTwoB {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = i; 1 <= j; j--) {
                System.out.print(j);
            }
        }
    }

}
