package org.spin.hackerrank.linkedlist;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_count = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        while (sc.hasNext() && a.size() < input_count) {
            a.add(sc.nextInt());
            if (a.size() == input_count)
                break;
        }
        for (Integer i : a) {
            System.out.println(i);
        }
    }
}
