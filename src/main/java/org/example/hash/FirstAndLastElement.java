package org.example.hash;

import java.util.LinkedList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(21);
        nums.add(31);
        nums.add(231);
        nums.add(241);
        System.out.println(nums);
        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());
        nums.removeFirst();
        System.out.println(nums);
        nums.removeLast();
        System.out.println(nums);
    }
}
