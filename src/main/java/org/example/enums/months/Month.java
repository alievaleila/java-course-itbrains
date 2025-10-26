package org.example.enums.months;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    SEPTEMBER(30),
    MARCH(31);

    private final int days;

    Month(int days) {
        this.days=days;
    }

    public int getDays() {
        return days;
    }
}

