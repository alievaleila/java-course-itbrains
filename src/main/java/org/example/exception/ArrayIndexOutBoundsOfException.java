package org.example.exception;

public class ArrayIndexOutBoundsOfException {
    public static void main(String[] args) {
        try{
            int[] a={1,2,3,4,5};
            System.out.println(a[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
