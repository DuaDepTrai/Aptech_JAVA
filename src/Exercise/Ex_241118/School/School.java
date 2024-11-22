/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.School;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class School {
    private String name;
    private String address;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    
    public School() {}
    
    public School(String name, String address, Student students, Teacher teachers, Course courses) {
        this.name = name;
        this.address = address;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added successfully.");
        } else {
            System.out.println("Student " + student.getName() + " already added.");
        }
    }
    
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student avaiable.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    
    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Student " + student.getName() + " was removed.");
        } else {
            System.out.println("Student " + student.getName() + " is not in school.");
        }
    }
    
    public void searchStudent(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name)) {
                System.out.println("Found student: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with name: " + name);
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
    
    public void updateStudent() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        if (findStudentById(id) != null) {
            System.out.println("Found student: ");
            System.out.println(findStudentById(id));
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new age: ");
            String newAgeInput = scanner.nextLine();
            System.out.print("Enter new class: ");
            String newClassRoom = scanner.nextLine();
            
            if (!newName.isBlank()) {
                findStudentById(id).setName(newName);
            }
            
            if (!newAgeInput.isBlank()) {
                int newAge = Integer.parseInt(newAgeInput);
                findStudentById(id).setAge(newAge);
            }
            
            if (!newClassRoom.isBlank()) {
                findStudentById(id).setClassRoom(newClassRoom);
            }
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Cannot found student with ID: " + id);
        }
    }
    
    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            System.out.println("Teacher: " + teacher.getName() + " was added successfully.");
        } else {
            System.out.println("Teacher: " + teacher.getName() + " already added to school.");
        }
    }
    
    public void displayTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teacher avaiable.");
        } else {
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }
    
    public void removeTeacher(Teacher teacher) {
        if (teachers.contains(teacher)) {
            teachers.remove(teacher);
            System.out.println("Teacher " + teacher.getName() + " removed successfully.");
        } else {
            System.out.println("Teacher " + teacher.getName() + " is not in school.");
        }
    }
    
    public void searchTeacher(String name) {
        boolean found = false;
        for (Teacher teacher : teachers) {
            if (teacher.getName().toLowerCase().contains(name)) {
                System.out.println("Found teacher: " + teacher);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No teacher found with name: " + name);
        }
    }
    
    public Teacher findTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }
    
    public void updateTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        if (findTeacherById(id) != null) {
            System.out.println("Found teacher: ");
            System.out.println(findTeacherById(id));
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new specialization: ");
            String newSpecialization = scanner.nextLine();
            
            if (!newName.isBlank()) {
                findTeacherById(id).setName(newName);
            }
            
            if (!newSpecialization.isBlank()) {
                findTeacherById(id).setSpecialization(newSpecialization);
            }
        } else {
            System.out.println("Cannot find teacher with ID: " + id);
        }
    }
    
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Course " + course.getName() + " was added successfully.");
        } else {
            System.out.println("Course " + course.getName() + " already added.");
        }
    }
    
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No course avaiable.");
        } else {
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }
    
    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course " + course.getName() + " was removed.");
        } else {
            System.out.println("Course " + course.getName() + " is not in school.");
        }
    }
    
    public void searchCourse(String name) {
        boolean found = false;
        for (Course course : courses) {
            if (course.getName().toLowerCase().contains(name)) {
                System.out.println("Found course: " + course);
            }
        }
        if (!found) {
            System.out.println("Cannot found couse with name: " + name);
        }
    }
    
    public Course findCourseById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
    
    public void updateCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        if (findCourseById(id) != null) {
            System.out.println("Found course: ");
            System.out.println(findCourseById(id));
            System.out.print("Enter new name: ");
        }
    }
    
    @Override
    public String toString() {
        return "School: " + name
                + "\nAddress: " + address
                + "\nNumber of Students: " + students.size()
                + "\nNumber of Teachers: " + teachers.size()
                + "\nNumber of Courses: " + courses.size();
    }
}
