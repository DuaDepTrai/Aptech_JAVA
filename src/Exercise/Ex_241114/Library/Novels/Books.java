/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241114.Library.Novels;

/**
 *
 * @author Admin
 */
public class Books {
    private String title;
    private String author;
    private String type;
    private double price;
    
    public Books(String title, String author, String type, double price) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getType() {
        return type;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Comic: " + title + " - Author: " + author + " - Type: " + type + " - Price: " + price;
    }    
}
