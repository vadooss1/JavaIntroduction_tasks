package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        char n = 'c', m = 'k', i = 'f';
        String k = "";
        k+=n;
        k+=m;
        k+=i;
        int c = 1;
        int[] array = {1, 2, 3, 4};
        LinkedList<String> seq = new LinkedList<>();
        seq.addLast("# " + 1 + " strategies");
        seq.addLast("# " + 2 + " strategies");
        seq.addLast("# " + 3 + " strategies");

        for (int j = 0; j < seq.size(); j++) {
            System.out.println(seq.get(j));

        }
        boolean[] j=new boolean[3];
        System.out.println(j[0]);
        System.out.println(Arrays.toString(array));
        System.out.println(c++);
        System.out.println(k);
        System.out.println((int)n);
        System.out.println((int)m);
        System.out.println((int)i);

    }

}