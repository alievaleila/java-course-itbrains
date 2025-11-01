package org.example.hash;

import java.util.LinkedList;

public class FindAndChange {
    public static void main(String[] args) {
        LinkedList<String > names=new LinkedList<>();
        names.add("Leyla");
        names.add("Ayla");
        names.add("Nurcan");
        names.add("Aysel");

        names.set(0,"Ibrahim");
        System.out.println(names);

    }
}
