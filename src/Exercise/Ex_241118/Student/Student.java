/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118;

/**
 *
 * @author Admin
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String classRoom;
    
    public Student(){}
    
    public Student(int id, String name, int age, String classRoom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classRoom = classRoom;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getClassRoom() {
        return classRoom;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " - Name: " + name + " - Age: " + age + " - Class: " + classRoom;
    }
}
