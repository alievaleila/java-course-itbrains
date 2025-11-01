package org.example.hash;

import java.util.LinkedList;

public class ReversedNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(28);
        nums.add(314);
        nums.add(416);
        nums.add(51);

        for (int num : nums) {
            int reversed=0;

            while(num!=0){
                reversed=reversed*10+num%10;
                num/=10;
            }
            System.out.println(reversed);
        }
    }
}
