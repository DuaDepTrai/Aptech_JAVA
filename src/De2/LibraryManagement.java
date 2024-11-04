/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Library library = new Library();
        int pick;
        
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("1. Add Book");
            System.out.println("2. Add member");
            System.out.println("3. Borrow item");
            System.out.println("4. Return item");
            System.out.println("5. List all of book");
            System.out.println("6. List of book borrowed by member");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            if (pick == 1) {
                System.out.print("Enter title of book: ");
                String bookTitle = scanner.nextLine();
                System.out.print("Enter Author of book: ");
                String bookAuthor = scanner.nextLine();
                LibraryItem item = new Book(bookTitle, bookAuthor);
                library.addItem(item);
                
            } else if (pick == 2) {
                System.out.print("Enter name of member: ");
                String name = scanner.nextLine();
                LibraryMember member = new LibraryMember(name);
                library.addMember(member);
                
            } else if (pick == 3) {
                System.out.print("Enter name of member: ");
                String borrowerName = scanner.nextLine();
                LibraryMember member = library.findMemberByName(borrowerName);
                
                if (member != null) {
                    System.out.print("Enter name of item: ");
                    String bookTitle = scanner.nextLine();
                    LibraryItem item = library.findItemByTitle(bookTitle);
                    
                    if (item != null) {
                        library.borrowItem(member, item);
                    } else {
                        System.out.println("Book: " + bookTitle + " is not exist");
                    }
                } else {
                    System.out.println("Member is not exist");
                }
                
            } else if (pick == 4) {
                System.out.print("Enter name of member: ");
                String name = scanner.nextLine();
                LibraryMember returner = library.findMemberByName(name);
                
                if (returner != null) {
                    System.out.print("Enter name of item: ");
                    String bookTitle = scanner.nextLine();
                    LibraryItem item = library.findItemByTitle(bookTitle);
                    
                    if (item != null) {
                        library.returnItem(returner, item);
                    } else {
                        System.out.println("Member have not borrowed book: " + bookTitle);
                    }
                } else {
                    System.out.println("Member is not exist");
                }
                
            } else if (pick == 5) {
                library.showAllItems();
                
            } else if (pick == 6) {
                System.out.print("Enter name of member: ");
                String name = scanner.nextLine();
                LibraryMember member = library.findMemberByName(name);
                
                if (member != null) {
                    member.showBorrowedItems();
                } else {
                    System.out.println("Member not found");
                }
                
            } else if (pick == 7) {
                System.out.println("Thank you!");
                break;
                
            } else {
                System.out.println("Invalid choice, please try again");
            }
        } while (pick != 7);
        
        scanner.close();
    }
}
