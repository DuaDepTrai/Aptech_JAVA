/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner;
    
    StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void addStudent() {
        System.out.println("=====\nADD NEW STUDENT:"); 
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (findStudentById(id) != null) {
            System.out.println("Student ID already exists!");
            return;
        }
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student class: ");
        String classRoom = scanner.nextLine();
        
        students.add(new Student(id, name, age, classRoom));
        System.out.println("Student " + name + " was added successfully!");
    }
    
    public void displayStudent() {
        System.out.println("=====\nLIST STUDENTS: ");
        if (students.isEmpty()) {
            System.out.println("No student in student list.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    
    public void searchStudentById() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("Student information: ");
            System.out.println(student);
        } else {
            System.out.println("Cannot find any student with ID: " + id);
        }
    }
    
    public void deleteStudentById() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Cannot find any student with ID: " + id);
        }
    }
    
    public void updateStudentById() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("Student found: ");
            System.out.println(student);
            
            System.out.println("Enter new name (leave blank to keep current name):");
            String newName = scanner.nextLine();
            System.out.println("Enter new age (enter 0 to keep current name): ");
            int newAge = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter new classroom (leave blank to keep current class): ");
            String newClassRoom = scanner.nextLine();
            
            if (!newName.isEmpty()) {
                student.setName(newName);
            }
            if (newAge != 0) {
                student.setAge(newAge);
            }
            if (!newClassRoom.isEmpty()) {
                student.setClassRoom(newClassRoom);
            }
            System.out.println("Student information was updated successfully");
        } else {
            System.out.println("Cannot find any student with ID: " + id);
        }
    }
    
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

}
