package com.naufal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberThree {

    public static void main(String[] args) {
        int n[] = {12, 9, 13, 6, 10, 4, 7, 2};
        List<Integer> listNumber = new ArrayList<>();
        for (int number : n) {
            if (number % 3 != 0) {
                listNumber.add(number);
            }
        }
        Collections.sort(listNumber);
        System.out.println(listNumber);
    }

}
