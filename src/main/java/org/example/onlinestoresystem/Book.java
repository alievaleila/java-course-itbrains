package org.example.onlinestoresystem;

public class Book extends Product{

    private String author;
    private double discountPercent;

    public Book(String name, double basePrice, String author, double discountPercent) {
        super(name, basePrice);
        this.author = author;
        this.discountPercent = discountPercent;
    }


    @Override
    double calculatePrice() {
        return getBasePrice() * (1 - discountPercent/100);
    }


    @Override
    public String toString() {
        return "Book{" +"name='"+super.getName()+'\''+
                ", price="+super.getBasePrice()+'\''+
                ", author='" + author + '\'' +
                ", discountPercent=" + discountPercent +
                "} " ;
    }
}
