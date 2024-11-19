/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Library {
    private ArrayList<Book> books;
    private Scanner scanner;
    
    Library() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
        
//        books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee", 1960, 15.99));
//        books.add(new Book(2, "1984", "George Orwell", 1949, 12.99));
//        books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.49));
//        books.add(new Book(4, "Pride and Prejudice", "Jane Austen", 1813, 8.99));
//        books.add(new Book(5, "Moby Dick", "Herman Melville", 1851, 11.50));
//        books.add(new Book(6, "War and Peace", "Leo Tolstoy", 1869, 20.00));
//        books.add(new Book(7, "The Catcher in the Rye", "J.D. Salinger", 1951, 13.75));
//        books.add(new Book(8, "The Lord of the Rings", "J.R.R. Tolkien", 1954, 25.99));
//        books.add(new Book(9, "The Alchemist", "Paulo Coelho", 1988, 9.99));
//        books.add(new Book(10, "Brave New World", "Aldous Huxley", 1932, 14.49));
    }
    
     public void addBook() {
        System.out.println("===== ADD NEW BOOK =====");
        System.out.print("Enter New Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        if (findBookById(id) == null) {
            System.out.print("Enter Book Name: ");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                System.out.println("Invalid name, please try again.");
                return;
            }
            
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            if (author.isBlank()) {
                System.out.println("Invalid author, please try again.");
                return;
            }
            
            System.out.print("Enter Published Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            if (year < 1800) {
                System.out.println("Invalid published year, please try again.");
                return;
            }
            
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            if (price <= 0) {
                System.out.println("Invalid price, please try again.");
                return;
            }
            
            books.add(new Book(id, name, author, year, price));
            System.out.println("Book " + name + " was added to library successfully!");
        } else {
            System.out.println("Book ID is existing, please try other ID.");
            return;
        }
    }
    
    public void displayBooks() {
        int count = 0;
        double value = 0;
        System.out.println("===== BOOKS LIST =====");
        if (books.isEmpty()) {
            System.out.println("No book in library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
                count += 1;
                value += book.getPrice();
            }
            System.out.println("-----\nNumber of books: " + count);
            System.out.println("Value of all books: " + value);
            mostExpensiveBook();
            cheapestBook();
        }
    }
    
    public void searchBookByName() {
        if (books.isEmpty()) {
            System.out.println("No book to search.");
            return;
        } else {
            System.out.print("Enter name to search: ");
            String name = scanner.nextLine().toLowerCase().trim();
            
            boolean found = false;
            for (Book book : books) {
                if (book.getName().toLowerCase().contains(name)) {
                    System.out.println(book);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No book found with name: " + name);
            }
        }
    }
    
    public void searchBookByAuthor() {
        if (books.isEmpty()) {
            System.out.println("No book to search.");
            return;
        } else {
            System.out.print("Enter author to search: ");
            String author = scanner.nextLine().toLowerCase().trim();
            
            boolean found = false;
            for (Book book : books) {
                if (book.getAuthor().toLowerCase().contains(author)) {
                    System.out.println(book);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No book found with author: " + author);
            }
        }
    }
    
    public void searchBookByYear() {
        if (books.isEmpty()) {
            System.out.println("No book to search.");
            return;
        } else {
            System.out.print("Enter published year to search: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            
            boolean found = false;
            for (Book book : books) {
                if (book.getYear() == year) {
                    System.out.println(book);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No book found with published year: " + year);
            }
        }
    }
    
    public void deleteBookById() {
        System.out.println("===== DELETE BOOK BY ID =====");
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Cannot find book with ID: " + id);
        } else {
            books.remove(book);
            System.out.println("Book deleted successfully!");
        }
    }
    
    public void updateBookById() {
        System.out.println("===== UPDATE BOOK BY ID =====");
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Cannot find book with ID: " + id);
        } else {
            System.out.println("Found book: ");
            System.out.println(book);
            
            System.out.print("Enter New Book Name (leave blank to keep current name): ");
            String newName = scanner.nextLine();
            System.out.print("Enter New Author (leave blank to keep current author): ");
            String newAuthor = scanner.nextLine();
            System.out.print("Enter New Published Year (type 1800 to keep current published year): ");
            int newYear = scanner.nextInt();
            scanner.nextLine();
            if (newYear < 1800) {
                System.out.println("Invalid year, please try again.");
                return;
            }
            System.out.print("Enter New Price (type 0 to keep current price): ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine();
            if (newPrice < 0 ){
                System.out.println("Invalid price, please try again.");
                return;
            }
            
            if (!newName.isBlank()) {
                book.setName(newName);
            }
            if (!newAuthor.isBlank()){
                book.setAuthor(newAuthor);
            }
            if (newYear != 1800) {
                book.setYear(newYear);
            }
            if (newPrice != 0) {
                book.setPrice(newPrice);
            }
            System.out.println("Book was updated successfully");
        }
    }
    
    public void sortBooksByPrice() {
        if (books.isEmpty()) {
            System.out.println("No book to sort.");
            return;
        } else {
            books.sort(Comparator.comparingDouble(Book::getPrice).reversed());
            System.out.println("Books sorted by price successfully.");
            displayBooks();
        }
    }
    
    public void sortBooksByAuthor() {
        if (books.isEmpty()) {
            System.out.println("No book to sort.");
            return;
        } else {
            books.sort(Comparator.comparing(Book::getAuthor));
            System.out.println("Books sorted by author successfully.");
            displayBooks();
        }
    }
    
    public void sortBooksByYear() {
        if (books.isEmpty()) {
            System.out.println("No book to sort.");
            return;
        } else {
            books.sort(Comparator.comparing(Book::getYear).reversed());
            System.out.println("Books sorted by year successfully.");
            displayBooks();
        }
    }
    
    public void sortBooksByName() {
        if (books.isEmpty()) {
            System.out.println("No book to sort.");
            return;
        } else {
            books.sort(Comparator.comparing(Book::getName));
            System.out.println("Books sorted by name successfully.");
            displayBooks();
        }
    }
        
    public void cheapestBook() {
        if (books.isEmpty()) {
            System.out.println("No book avaiable.");
            return;
        } else {
            Book cheapest = books.stream().min(Comparator.comparingDouble(Book::getPrice)).orElse(null);
            System.out.println("The cheapest book: ");
            System.out.println(cheapest);
        }
    }
    
    public void mostExpensiveBook() {
        if (books.isEmpty()) {
            System.out.println("No book avaiable.");
            return;
        } else {
            Book expensive = books.stream().max(Comparator.comparingDouble(Book::getPrice)).orElse(null);
            System.out.println("The most expensive book: ");
            System.out.println(expensive);
        }
    }
    
    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
