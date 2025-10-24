package org.example.volumecalculatorsystem;



public class VolumeCalculator {

    public double volume(double side){
        return Math.pow(side,3);
    }

    public double volume(int a, int b, int c){
        return a*b*c;
    }

    public double volume(int radius){
        return (3/4)*Math.PI*Math.pow(radius,3);
    }





}
