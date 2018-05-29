package com.kingl.zxs.litepal;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/5/29.
 */

public class Book extends DataSupport{
    private String press;
    private int id;
    private String author;
    private double price;
    private int pages;
    private String name;

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {

        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
