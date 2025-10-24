package org.example.volumecalculatorsystem;

public class AdvencedVolumeCalculator extends VolumeCalculator{
    @Override
    public double volume(int radius) {
        System.out.println("Volume is calculated");
        return super.volume(radius);

    }
}
