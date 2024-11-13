/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT8.music;

/**
 *
 * @author Admin
 */
public class CompactDisc {
    private String title;
    private String artist;
    private double price;
    private int code;
    
    public CompactDisc(String title, String artist, double price, int code)
    {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getCode() {
        return code;
    }
    
    @Override
    public String toString() {
        return "Music CD: " + title + ", Artist: " + artist + ", Price: " + price + ", Code: " + code;
    }
}
