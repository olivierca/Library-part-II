package com.simplon;


public class Book {
    private String  title="";
    private int     nbPages=0;
    private static final int shippingDay=1;

    public Book(String title,int pages)
    {
        this.title = title;
        nbPages = pages;
    }
}
