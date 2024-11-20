/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.Course;

/**
 *
 * @author Admin
 */
public class Course {
    private int id;
    private String name;
    private String teacher;
    private double duration;
    private double fee;
    
    public Course(){}
    
    public Course(int id, String name, String teacher, double duration, double fee) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.duration = duration;
        this.fee = fee;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getTeacher() {
        return teacher;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public double getFee() {
        return fee;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " - Course: " + name + " - Teacher: " + teacher
                + " - Duration: " + duration + " - Fee: " + fee;
    }
}
