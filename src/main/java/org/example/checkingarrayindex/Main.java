package org.example.checkingarrayindex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int a=sc.nextInt();

            int[]b={1,2,4,6};
            System.out.println(b[a]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
