package com.revature.assigment;

import java.util.TreeSet;

public class TS {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        for(int i = 0; i < 10; i++){
            treeSet.add(i);
        }

        treeSet2.addAll(treeSet);

        treeSet2.descendingIterator().forEachRemaining(System.out::print);

        System.out.println();
        System.out.println(treeSet2.first());
        System.out.println(treeSet2.last());
    }
}
