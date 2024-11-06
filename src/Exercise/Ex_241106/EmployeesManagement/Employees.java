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
public class Employees extends Person implements Employee {
    private int employeeId;
    private double baseSalary;
    private double salaryCoefficient;
    private double salary = 0;

    public Employees(String name, int age, String address, int employeeId, double baseSalary, double salaryCoefficient, double salary) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.salaryCoefficient = salaryCoefficient;
        this.salary = salary;
    }
    
    @Override
    public double calculateSalary(double baseSalary, double salaryCoefficient) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter number of working days: ");
        int workingDay = scanner.nextInt();
        System.out.print("Enter number of days late: ");
        int dayLate = scanner.nextInt();
        System.out.print("Enter reward: ");
        double reward = scanner.nextDouble();
        
        return baseSalary*salaryCoefficient/26*workingDay
                        - 50000*dayLate + reward;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }
    
    public double getSalary() {
        return salary;
    }
}
