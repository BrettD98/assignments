package com.revature.assigment;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for(int i = 0; i < 10; i++){
            linkedList.add(i);
        }

        for(int i : linkedList){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 5; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();

        for (int i = linkedList.size() -1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();

        linkedList.add(3,0);
        for(int i : linkedList){
            System.out.print(i + " ");
        }
    }
}
