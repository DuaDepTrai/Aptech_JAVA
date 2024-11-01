/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241023;

/**
 *
 * @author Admin
 */
public class Ex1 {
    //Bien static
    public static int count = 0;

    //Bien thuong
    public int id;

    //Constructor id
    public Ex1(int id) {
        this.id = id;
        count++;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("So doi tuong (count): " + count);
    }

    public static void main(String[] args) {
        Ex1 obj1 = new Ex1(1);
        Ex1 obj2 = new Ex1(3);
        Ex1 obj3 = new Ex1(4);
        
        System.out.println("---\nThong tin doi tuong 1:");
        obj1.display();
        
        System.out.println("---\nThong tin doi tuong 2:");
        obj2.display();
        
        System.out.println("---\nThong tin doi tuong 3:");
        obj3.display();
    }
}
