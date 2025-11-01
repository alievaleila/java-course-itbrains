package org.example.hash;

import java.util.HashSet;

public class DublicateWords {
    public static void main(String[] args) {
        String[] arr={"apple","banana","apple","orange"};
        HashSet <String> seen=new HashSet<>();
        HashSet <String> dublicates=new HashSet<>();

        for(String word:arr){
            if(!seen.add(word)){
                dublicates.add(word);
            }
        }
        System.out.println(dublicates);

    }
}
