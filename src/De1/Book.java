/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

/**
 *
 * @author Admin
 */
public class Book {
    private String title;
    private boolean avaiable;
    
    public Book() {
    }
    
    public Book(String title) {
        this.title = title;
        this.avaiable = true;
    }
    
    public String getTitle() {
        return title;
    }
    
    public boolean isAvaiable() {
        return avaiable;
    }
    
    public void borrow() {
        if (avaiable) {
            avaiable = false;
        } else System.out.println("This book is not avaiable");
    }
    
    public void returnBook() {
        avaiable = true;
    }
}
