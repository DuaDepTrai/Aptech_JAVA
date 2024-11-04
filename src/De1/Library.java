/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    
    Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    
    public void addBook(Book book) {        
        books.add(book);
        System.out.println("Book: " + book.getTitle() + " was added to library");
    }
    
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Memer: " + member.getMemmberName() + " was added to member list");
    }
    
    public void borrowBook(LibraryMember member, Book book) {
        member.borrowBook(book);
    }
    
    public void returnBook(LibraryMember member) {
        member.returnBook();
    }
    
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    public LibraryMember findMemberByName(String name) {
        for (LibraryMember member : members) {
            if (member.getMemmberName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }
    
    public void displayAllBooks() {
        System.out.println("List book:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " ("
                    + (book.isAvailable() ? "Avaiable" : "Not avaiable") + ")");
        }
    }
}
