package org.example.enums.employeeranksystem;

public enum Rank {
    JUNIOR(1.0),
    MID(1.5),
    SENIOR(2.0),
    LEAD(3.0);

    private double multiplier ;

    Rank(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
