/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241118.School;

/**
 *
 * @author Admin
 */
public class Teacher {
    private int id;
    private String name;
    private String specialization;
    
    public Teacher() {}
    
    public Teacher(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public String toString() {
        return "Teacher ID: " + id + " - Teacher: " + name + " - Specialization: " + specialization;
    }
}
