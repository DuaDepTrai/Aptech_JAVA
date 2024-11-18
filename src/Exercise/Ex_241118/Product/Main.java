/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Product;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager product = new ProductManager();
        int pick;
        
        do {
            System.out.println("===== PRODUCTS MANAGERMENT =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product List");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Sort Product By Price");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.displayProducts();
                    break;
                case 3:
                    product.searchProductById();
                    break;
                case 4:
                    product.updateProductById();
                    break;
                case 5:
                    product.deleteProductById();
                    break;
                case 6:
                    product.sortProductByPrice();
                    break;
                case 7:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid chosen. Please try again!");
            }
        } while (pick != 7);
        
        scanner.close();
    }
}
