package com.revature.assigment;

import java.util.HashSet;

public class HS {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < 10; i++){
            hashSet.add(i);
        }

        for(int i : hashSet){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(hashSet.size());

        for (int i = hashSet.size() -1; i >= 0; i--) {
            hashSet.remove(i);
        }

        if (hashSet.isEmpty()){
            System.out.println("Its Empty");
        }else {
            System.out.println("There Is Something Inside");
        }

    }

}
