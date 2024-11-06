/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241106.EmployeesManagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Management {
    private ArrayList<Employees> employeesList;
    
    public Management() {
        employeesList = new ArrayList<>();
    }
    
    public void addEmployee(Employees employee) {
        employeesList.add(employee);
    }
    
    public void removeEmployee(Employees employee) {
            employeesList.remove(employee);
    }
        
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employees employee : employeesList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    
    public Employees findEmployeeById(int employeeId) {
        for (Employees employee : employeesList) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
    
    public void displayEmployeeInformation (Employees employees) {
        System.out.println("Employee name: " + employees.getName());
        System.out.println("Age: " + employees.getAge());
        System.out.println("Address: " + employees.getAddress());
        System.out.println("Base salary: " + employees.getBaseSalary());
        System.out.println("Salary coefficient: " + employees.getSalaryCoefficient());
        System.out.println("Salary: " + employees.getSalary());
        System.out.println("=====");
    }
    
    public void displayAllEmployees() {
        System.out.println("List employees: ");
        for (Employees employee : employeesList) {
            System.out.println(employee.getName() + " - " + employee.getAge() + " - "
                               + employee.getAddress() + " - " + employee.getSalary());
        }
    }
}
