/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241025;

/**
 *
 * @author Admin
 */
class Animal {
    public void makeSound(){
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Go go go");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        animal.makeSound();
    }
}