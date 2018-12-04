package com.BookShop;

public class GoldenEditionBook extends  Book {
    GoldenEditionBook(String author, String title, double price) {
        super(author, title, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() +super.getPrice()*0.3;
    }


}
