/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241106.EmployeesManagement;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EmployeesManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Management employee = new Management();
        int pick;
        
        do {
            System.out.println("-----\nMenu: ");
            System.out.println("1. Add new employee");
            System.out.println("2. Remove employee");
            System.out.println("3. Employee information");
            System.out.println("4. Calculate employee salary");
            System.out.println("5. All employees information");
            System.out.println("6. Total salary");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int employeeId = scanner.nextInt();
                    if (employee.findEmployeeById(employeeId) == null) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // clear buffer
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter base salary: ");
                        double baseSalary = scanner.nextDouble();
                        System.out.print("Enter salary coefficient: ");
                        double salaryCoefficient = scanner.nextDouble();

                        // Khởi tạo đối tượng Employees
                        Employees newEmployee = new Employees(name, age, address, employeeId, baseSalary, salaryCoefficient, 0);
                        employee.addEmployee(newEmployee);
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Employee ID is existing, please use an other ID.");
                    }            
                    break;
                    
                case 2:
                     System.out.print("Enter employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    Employees employeeToRemove = employee.findEmployeeById(removeId);
                    if (employeeToRemove != null) {
                        employee.removeEmployee(employeeToRemove);
                        System.out.println("Employee removed successfully!");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
 {
                    
                break;
                    
            } else if (pick == 2) {
                
            } else if (pick == 3) {
                
            } else if (pick == 4) {
                
            } else if (pick == 5) {
                
            } else if (pick == 6) {
                
            } else if (pick == 7) {
                
            }
        } while (pick != 7);
        
        scanner.close();
    }
}

