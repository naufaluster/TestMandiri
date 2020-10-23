package com.naufal;

public class NumberOne {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 && i % 3 == 0){
                System.out.println("OKYES");
            } else if (i % 4 == 0) {
                System.out.println("YES");
            } else if (i % 3 == 0) {
                System.out.println("OK");
            } else {
                System.out.println(i);
            }
        }

    }
}
