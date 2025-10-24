package org.example.enumandprice;

public enum Currency {
    USD(1.7),
    EUR(1.8),
    TRY(0.095),
    AZN(1.0);

    private final double rate ;

    Currency(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double convertToAzn(double amount){
        return amount* AZN.getRate();
    }
}
