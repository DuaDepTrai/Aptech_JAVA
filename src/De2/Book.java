/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

/**
 *
 * @author Admin
 */
public class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean available;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
        } else System.out.println("This book is not available");
    }

    @Override
    public void returnItem() {
        available = true;
    }
}
