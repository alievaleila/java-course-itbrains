package org.example.volumecalculatorsystem;

public class Main {
    public static void main(String[] args) {
        VolumeCalculator v=new AdvencedVolumeCalculator();
        VolumeCalculator a=new VolumeCalculator();

        v.volume(5);
        System.out.println(a.volume(6));

    }
}
