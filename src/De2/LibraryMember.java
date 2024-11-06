/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LibraryMember {
    private String memberName;
    private ArrayList<LibraryItem> borrowedItems;
    
    public LibraryMember(String memberName) {
        this.memberName = memberName;
        this.borrowedItems = new ArrayList<>();
    }
    
    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.borrowItem();
            borrowedItems.add(item);
            System.out.println(memberName + " borrowed book: " + item.getTitle());
        } else {
            System.out.println("Book: " + item.getTitle() + " has been borrowed");
        }
    }
    
    public void returnItem(LibraryItem item) {
        if (borrowedItems.contains(item)) {
            item.returnItem();
            borrowedItems.remove(item);
            System.out.println(memberName + " returned book: " + item.getTitle());
        } else {
            System.out.println(memberName + " did not borrow book: " + item.getTitle());
        }
    }
    
    public void showBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println(memberName + " have not borrowed any book");
        } else {
            System.out.println("List of books " + memberName + " borrowing: ");
            for (LibraryItem item : borrowedItems) {
                System.out.println("- " + item.getTitle());
            }         
        }
    }
    
    public String getMemberName() {
        return memberName;
    }
}
