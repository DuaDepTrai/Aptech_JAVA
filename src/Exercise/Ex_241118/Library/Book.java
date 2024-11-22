/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Library;

/**
 *
 * @author Admin
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private int year;
    private double price;
    
    public Book() {}
    
    public Book(int id, String name, String author, int year, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " - Name: " + name + " - Author: " + author
                + " - Year: " + year + " - Price: " + price;
    }
}
