/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT8.customer;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UserInterface {
    private CDCreator cdCreator;
    private Scanner scanner;
    
    public UserInterface(int movieCapacity, int musicCapacity) {
        cdCreator = new CDCreator(movieCapacity, musicCapacity);
        scanner = new Scanner(System.in);
    }
    
    public void showMenu() {
        int pick;
        
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("1. Add a new Music CD to the collection");
            System.out.println("2. Add a new Movie CD to the collection");
            System.out.println("3. Display all music CDs in the collection");
            System.out.println("4. Display all movie CDs in the collection");
            System.out.println("5. Exit the application");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    addMusicCD();
                    break;
                case 2:
                    addMovieCD();
                    break;
                case 3:
                    displayMusicCDs();
                    break;
                case 4:
                    displayMusicCDs();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        } while (pick != 5);
    }
    
    private void addMusicCD() {
        System.out.print("Enter title of the Music CD: ");
        String title = scanner.nextLine();
        System.out.print("Enter artist: ");
        String artist = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter code: ");
        int code = scanner.nextInt();
        scanner.nextLine();

        cdCreator.addMusicCD(title, artist, price, code);
        System.out.println("Music CD added successfully.");
    }
    
    private void addMovieCD() {
        System.out.print("Enter title of the Movie CD: ");
        String title = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter code: ");
        int code = scanner.nextInt();
        scanner.nextLine();

        cdCreator.addMovieCD(title, price, code);
        System.out.println("Movie CD added successfully.");
    }
    
    private void displayMusicCDs() {
        System.out.println("All Music CDs: ");
        cdCreator.displayAllMusicCDs();
    }
    
    private void displayMovieCDs() {
        System.out.println("All Movie CDs: ");
        cdCreator.displayAllMovieCDs();
    }
    
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(10, 10);
        ui.showMenu();
    }
}
