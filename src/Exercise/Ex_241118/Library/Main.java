/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Library;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Library book = new Library();
        int pick;
        
        do {
            System.out.println("===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Book List");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Sort Book");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    book.displayBooks();
                    break;
                case 3:
                    char pick3;
                    do {
                        System.out.println("-----\nSEARCH BOOK: ");
                        System.out.println("a. Search By Name");
                        System.out.println("b. Search By Author");
                        System.out.println("c. Search By Published Year");
                        System.out.println("d. Back");
                        System.out.print("Choose an option: ");
                        pick3 = scanner.next().charAt(0);
                        
                        switch (pick3) {
                            case 'a':
                                book.searchBookByName();
                                break;
                            case 'b':
                                book.searchBookByAuthor();
                                break;
                            case 'c':
                                book.searchBookByYear();
                                break;
                            case 'd':
                                break;
                            default:
                                System.out.println("Invalid chosen, please try again");
                        }
                    } while (pick3 != 'd');
                    break;
                case 4:
                    book.updateBookById();
                    break;
                case 5:
                    book.deleteBookById();
                    break;
                case 6:
                    char pick6;
                    do {
                        System.out.println("SORT BOOKS:");
                        System.out.println("a. Sort By Name");
                        System.out.println("b. Sort By Author");
                        System.out.println("c. Sort By Price");
                        System.out.println("d. Sort By Published Year");
                        System.out.println("e. Back");
                        System.out.print("Choose an option: ");
                        pick6 = scanner.next().charAt(0);
                        
                        switch (pick6) {
                            case 'a':
                                book.sortBooksByName();
                                break;
                            case 'b':
                                book.sortBooksByAuthor();
                                break;
                            case 'c':
                                book.sortBooksByPrice();
                                break;
                            case 'd':
                                book.sortBooksByYear();
                                break;
                            case 'e':
                                break;
                            default:
                                System.out.println("Invalid chosen, please try again");
                        }
                    } while (pick6 != 'e');
                    break;
                case 7:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid chosen, please try again.");
            }
        } while (pick != 7);
        
        scanner.close();
    }
}
