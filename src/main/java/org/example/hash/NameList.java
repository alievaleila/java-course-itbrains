package org.example.hash;

import java.util.LinkedList;

public class NameList {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Leyla");
        names.add("Ibrahim");
        names.add("Rovshan");
        names.add("Teymur");
        System.out.println(names.remove("Leyla"));

        System.out.println(names);

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));

        }
    }
}
