/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int pick;
        
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("1. Add book");
            System.out.println("2. Add member");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5. Display list of book");
            System.out.println("6. Exit");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            if (pick == 1) {
                System.out.print("Enter name of book: ");
                String bookTitle = scanner.nextLine();
                Book book = new Book(bookTitle);
                library.addBook(book);
            } else if (pick == 2) {
                System.out.print("Enter name of member: ");
                String memberName = scanner.nextLine();
                LibraryMember member = new LibraryMember(memberName);
                library.addMember(member);
            } else if (pick == 3) {
                System.out.print("Enter name of member borrowing book: ");
                String borrowerName = scanner.nextLine();
                LibraryMember member = library.findMemberByName(borrowerName);
                
                if (member != null) {
                    System.out.println("Enter name of book: ");
                    String bookTitle = scanner.nextLine();
                    Book book = library.findBookByTitle(bookTitle);
                    
                    if (book != null) {
                        library.borrowBook(member, book);
                    } else {
                        System.out.println("Book is not exist");
                    }
                } else {
                    System.out.println("Member is not exist");
                }
            } else if (pick == 4) {
                System.out.print("Enter name of member returning book: ");
                String returnerName = scanner.nextLine();
                LibraryMember returner = library.findMemberByName(returnerName);
                
                if (returner != null) {
                    library.returnBook(returner);
                } else {
                    System.out.println("Member is not exist");
                }
            } else if (pick == 5) {
                library.displayAllBooks();
            } else if (pick == 6) {
                System.out.println("Thank you!");
                break;
            } else System.out.println("Invalid choice, please try again");
        } while (pick != 6);
        
        scanner.close();
    }
}
