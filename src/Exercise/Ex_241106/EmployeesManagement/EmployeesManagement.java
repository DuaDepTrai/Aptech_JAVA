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
                    scanner.nextLine();
                    if (employee.findEmployeeById(employeeId) == null) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter base salary: ");
                        double baseSalary = scanner.nextDouble();
                        System.out.print("Enter salary coefficient: ");
                        double salaryCoefficient = scanner.nextDouble();
                        scanner.nextLine();

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

                case 3:
                    System.out.print("Enter employee ID to view: ");
                    int viewId = scanner.nextInt();
                    Employees employeeToView = employee.findEmployeeById(viewId);
                    if (employeeToView != null) {
                        employee.displayEmployeeInformation(employeeToView);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter employee ID to calculate salary: ");
                    int calcId = scanner.nextInt();
                    Employees employeeToCalculate = employee.findEmployeeById(calcId);
                    if (employeeToCalculate != null) {
                        System.out.println("Employee: " + employee.findEmployeeById(calcId));
                        double salary = employeeToCalculate.calculateSalary(employeeToCalculate.getBaseSalary(), employeeToCalculate.getSalaryCoefficient());
                        employeeToCalculate.setSalary(salary);
                        System.out.printf("Salary calculated and updated: " + (int) salary);
                        System.out.println();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    employee.displayAllEmployees();
                    break;

                case 6:
                    double totalSalary = employee.calculateTotalSalary();
                    System.out.println("Total salary of all employees: " + (int) totalSalary);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (pick != 7);

        scanner.close();
    }
}

