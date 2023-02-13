package ie.atu.productv5;

import ie.atu.productv5.Product;

public class Book extends Product {

    private String author;

    public Book() {
        super();
        author = "";
        count++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + author + " \nThe price is " + getPrice();
    }
}

