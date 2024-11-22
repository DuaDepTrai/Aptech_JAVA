/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.School;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;
    
    public Course() {}
    
    public Course(int id, String name, Teacher teacher, Student students) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added to course " + name + " successfully");
        } else {
            System.out.println("Student " + student.getName() + " is already added to course " + name +".");
        }
    }
    
    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Student " + student.getName() + " removed form course " + name +".");
        } else {
            System.out.println("Student " + student.getName() + " is not added to the course " + name + ".");
        }
    }
    
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student in the course " + name + ".");
        } else {
            System.out.println("Students in the course " + name + ":");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Course ID: " + id + " - Course: " + name
                + " - Teacher: " + (teacher != null ? teacher.getName() : "None")
                + " - Number of students: " + students.size();
    }
}
