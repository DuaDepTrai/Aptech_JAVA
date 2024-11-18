/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProductManager {
    private ArrayList<Product> products;
    private Scanner scanner;
    
    ProductManager() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void addProduct() {
        System.out.println("===== ADD NEW PRODUCT =====");
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        if (findProductById(id) == null) {
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();
            
            if (name.isBlank() || price <=0 || quantity < 0) {
                System.out.println("Invalid value. Please try again!");
                return;
            } else {
            products.add(new Product(id, name, price, quantity));
            System.out.println("Product " + name + " added successfully");
            }
        } else {
            System.out.println("Product ID already exists!");
            return;
        }    
    }
    
    public void displayProducts() {
        double sum = 0;
        System.out.println("===== PRODUCTS LIST =====");
        if (products.isEmpty()) {
            System.out.println("No product in the list!");
        } else {
            for (Product product : products) {
                System.out.println(product);
                sum += product.getPrice()*product.getQuantity();
            }
            System.out.println("Total inventory value: " + sum);
        }
    }
    
    public void searchProductById() {
        System.out.println("===== SEARCH PRODUCT =====");
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = findProductById(id);
        
        if (product == null) {
            System.out.println("Cannot find product with ID: " + id);
        } else {
            System.out.println("Product Information: ");
            System.out.println(product);
        }
    }
    
    public void updateProductById() {
        System.out.println("===== UPDATE PRODUCT =====");
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = findProductById(id);
        
        if (product == null) {
            System.out.println("Cannot find product with ID: " + id);
        } else {
            System.out.println("Found product: ");
            System.out.println(product);
            System.out.print("Enter New Product Name (leave blank to keep current name): ");
            String newName = scanner.nextLine();
            System.out.print("Enter New Product Price (Type 0 to keep current price): ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter new Prpduct Quantity (Type -1 to keep current quantity): ");
            int newQuantity = scanner.nextInt();
            
            if (newPrice < 0 || newQuantity < -1) {
                System.out.println("Invalid value. Please try again!");
            } else {
                if (!newName.isBlank()) {
                    product.setName(newName);
                }
                if (newPrice != 0) {
                    product.setPrice(newPrice);
                }
                if (newQuantity != -1)
                    product.setQuantity(newQuantity);
                System.out.println("Product was updated successfully!");
            }
        }
    }
    
    public void deleteProductById() {
        System.out.println("===== DELETE PRODUCT =====");
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = findProductById(id);
        
        if (product == null) {
            System.out.println("Cannot find product with ID: " + id);
        } else {
            products.remove(product);
            System.out.println("Product deleted successfully!");
        }
    }
    
    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    
    public void sortProductByPrice() {
        if (products.isEmpty()) {
            System.out.println("No product to sort.");
            return;
        } else {
            products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
            System.out.println("Products sorted successfully!");
            displayProducts();
        }
    }
}
