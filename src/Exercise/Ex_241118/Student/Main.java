/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager student = new StudentManager();
        int pick;
        
        do {
            System.out.println("===== STUDENT MANAGERMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display student list");
            System.out.println("3. Search student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();
            scanner.nextLine();
            
            switch (pick) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.displayStudent();
                    break;
                case 3:
                    student.searchStudentById();
                    break;
                case 4:
                    student.updateStudentById();
                    break;
                case 5:
                    student.deleteStudentById();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid chosen. Please try again!");
            }
        } while (pick != 5);
        
        scanner.close();
    }
}
