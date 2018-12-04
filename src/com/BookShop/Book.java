package com.BookShop;

public class Book {

    private String author;
    private String title;
    private double price;


    Book(String author, String title, double price) {
        setAuthor(author);
        setTitle(title);
        setPrice(price);
    }


    private void setAuthor(String author) {
        try {
            String[] item = author.split("\\s+");

            if (Character.isDigit(item[1].charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
            this.author = author;
        }catch (Exception e){

        }
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    private String getAuthor() {
        return author;
    }

    private String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
