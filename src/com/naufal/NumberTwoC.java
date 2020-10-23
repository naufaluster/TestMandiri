package com.naufal;

public class NumberTwoC {

    public static void main(String[] args) {
        int n = 5;
        int counter = 0;
        int total = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if (counter == 0) {
                    System.out.print(total++);
                    if (total == 5) {
                        counter = 1;
                    }
                } else if (counter == 1) {
                    System.out.print(total--);
                    if (total == 1) {
                        counter = 0;
                    }
                }
            }
        }
    }

}
