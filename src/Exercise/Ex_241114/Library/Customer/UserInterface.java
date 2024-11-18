/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241114.Library.Customer;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UserInterface {
    private BookCreator bookCreator;
    private Scanner scanner;
    
    public UserInterface(int comicCapacity, int novelCapacity) {
        bookCreator = new BookCreator(comicCapacity, novelCapacity);
        scanner = new Scanner (System.in);
    }
    
    public void showMenu() {
        int pick;
        
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("1. Add a new Comic to Library");
            System.out.println("2. Add a new Novel to Library");
            System.out.println("3. Display all Comic in Library");
            System.out.println("4. Display all Novel in Library");
            System.out.println("5. Exit the application");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    addComic();
                    break;
                case 2:
                    addNovel();
                    break;
                case 3:
                    displayAllComics();
                    break;
                case 4:
                    displayAllNovels();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (pick != 5);
    }
    
    private void addComic() {
        System.out.println("Enter title of Comic: ");
        String title = scanner.nextLine();
        System.out.println("Enter author of Comic: ");
        String author = scanner.nextLine();
        System.out.println("Enter type of Comic: ");
        String type = scanner.nextLine();
        System.out.println("Enter price of Comic: ");
        double price = scanner.nextDouble();
        
        bookCreator.addComic(title, author, type, price);
        System.out.println("Comic added successfully");
    }
    
    private void addNovel() {
        System.out.println("Enter title of Novel: ");
        String title = scanner.nextLine();
        System.out.println("Enter author of Novel: ");
        String author = scanner.nextLine();
        System.out.println("Enter type of Novel: ");
        String type = scanner.nextLine();
        System.out.println("Enter price of Novel: ");
        double price = scanner.nextDouble();
        
        bookCreator.addNovel(title, author, type, price);
        System.out.println("Novel added successfully");
    }
    
    private void displayAllComics() {
        System.out.println("All comics: ");
        bookCreator.displayAllComics();
    }
    
    private void displayAllNovels() {
        System.out.println("All novels: ");
        bookCreator.displayAllNovels();
    }
    
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(100, 100);
        ui.showMenu();
    }
}
