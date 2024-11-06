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
public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryMember> members;
    
    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
    }
    
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Book: " + item.getTitle() + " was added to library");
    }
    
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member: " + member.getMemberName() + " was added to member list");
    }
    
    public void borrowItem(LibraryMember member, LibraryItem item) {
        member.borrowItem(item);
    }
    
    public void returnItem(LibraryMember member, LibraryItem item) {
        member.returnItem(item);
    }
    
    public void showAllItems() {
        System.out.println("List books: ");
        for (LibraryItem item : items) {
            System.out.println("- " + item.getTitle() + "- " + (item.isAvailable() ? "Available" : "Not available"));
        }
    }
    
    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
    
    public LibraryMember findMemberByName(String name) {
        for (LibraryMember member : members) {
            if (member.getMemberName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }
}
