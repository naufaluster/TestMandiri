package com.naufal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberTwoD {

    public static void main(String[] args) {

        int n = 5;
        int counter = n;
        int init = 1;

        List<List<Integer>> listNumber = new ArrayList<>();
        int i = 1;
        for (i = 1; i <= n; i++) {
            List<Integer> listNumberTemp = new ArrayList<>();
            for (int j = init; j <= counter; j++) {
                listNumberTemp.add(j);
            }
            listNumber.add(listNumberTemp);
            if (init < counter) {
                counter += n;
                init += n;
            }
        }

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
            } else {
                Collections.sort(listNumber.get(j), Collections.reverseOrder());
            }
        }

        for (int k = 0; k < listNumber.size(); k++) {
            System.out.println();
            for (List list : listNumber) {
                System.out.print(list.get(k) + "  ");
            }
        }

    }
}