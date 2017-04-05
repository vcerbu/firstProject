package com.endava.entity;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Book {
    private String author, title;
    private float price;
    private int year, numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (this.author != author)
            this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (this.title != title)
            this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (this.price != price)
            this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (this.year != year)
            this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (this.numberOfPages != numberOfPages)
            this.numberOfPages = numberOfPages;
    }

    public Book() {
    }

    public Book(String author, String title, float price, int numberOfPages, int year) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    public Book(Book book) {
        this.author = book.getAuthor();
        this.price = book.getPrice();
        this.year = book.getYear();
        this.title = book.getTitle();
        this.numberOfPages = book.getNumberOfPages();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

}
