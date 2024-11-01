/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    
    public Contact(int id, String firstName, String lastName, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void display() {
        System.out.printf("ID: %d\t\tFirst Name: %s\t\tLast Name: %s\t\tPhone No: %s%n", id, firstName, lastName, phone);
    }
}

public class ContactManager {
    private ArrayList<Contact> contacts;
    private Scanner scanner;
    
    public ContactManager() {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void addContact() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();        
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter Phone No: ");
        String phone = scanner.nextLine();
        
        Contact contact = new Contact(id, firstName, lastName, phone);
        contacts.add(contact);
        System.out.println("Contact added successgully!");
    }
    
   public void displayContact() {
       if (contacts.isEmpty()) {
           System.out.println("No contact to display");
       } else {
           for (Contact contact : contacts) {
               contact.display();
           }
       }
   }
   
   public void sortContactsByFirstName() {
       Collections.sort(contacts, Comparator.comparing(Contact::getFirstName));
       System.out.println("Contacts sorted by first name");
   }
   
   public void searchContact(String searchString) {
       boolean found = false;
       
       for (Contact contact : contacts) {
           if (contact.getFirstName().toLowerCase().contains(searchString.toLowerCase())) {
               contact.display();
               found = true;
           }
       }
       if (!found) {
           System.out.println("No contact found with first name contains: " + searchString);
       }
   }
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        int pick;
        
        do {
            System.out.println("-----\nContact Manager:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Sort Contact By First Name");
            System.out.println("4. Search Contact By First Name");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            pick = scanner.nextInt();
                        
            if (pick == 1) {
                manager.addContact();
            } else if (pick == 2) {
                manager.displayContact();
            } else if (pick == 3) {
                manager.sortContactsByFirstName();
            } else if (pick == 4) {
                System.out.print("Enter First Name To Search: ");
                String searchString = scanner.next();
                manager.searchContact(searchString);
            } else if (pick == 5) {
                System.out.println("Exiting Contact Manager");
                break;
            } else System.out.println("Invalid option, try a gain please!");
        } while (pick != 5);
    }
   
}
