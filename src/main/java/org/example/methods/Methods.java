package org.example.methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        greet("Leyla");
        System.out.println(isPositive(-45));
        System.out.println(sumArray(new int[]{1,2,3,5,6}));
        System.out.println(reverseString("Leyla"));
        System.out.println(maxNumber(new int[]{7,3,6,74,3}));

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void greet(String name){
        System.out.println("Salam, "+name);
    }

    public static boolean isPositive(int a){
        return a > 0;
    }

    public static int sumArray(int[]arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static String reverseString(String str){
        String reversed="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }

    public static int maxNumber(int[]arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
