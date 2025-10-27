package org.example.enums.currency;

public enum Currency {
    USD(1.7),
    EUR(1.8),
    TRY(0.095),
    AZN(1.0);

    private final double rate;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double convertToAzn(double amount, String name) {
        if (name.equalsIgnoreCase("USD"))
            return amount * USD.getRate();
        else if (name.equalsIgnoreCase("TRY"))
            return amount * TRY.getRate();
        else if (name.equalsIgnoreCase("EUR"))
            return amount * EUR.getRate();
        else
            return 0;
    }
}

