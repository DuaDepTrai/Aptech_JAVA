/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT8.movies;

/**
 *
 * @author Admin
 */
public class CompactDisc {
    private String title;
    private double price;
    private int code;
        
    public CompactDisc(String title, double price, int code)
    {
        this.title = title;
        this.price = price;
        this.code = code;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getCode() {
        return code;
    }
    
    @Override
    public String toString() {
        return "Movie CD: " + title + ", Price: " + price + ", Code: " + code;
    }
}
