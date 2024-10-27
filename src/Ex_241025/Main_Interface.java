/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241025;

/**
 *
 * @author Admin
 */
interface Animal2 {
    void makeSound();
    void makeEat();
}

class Dog implements Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Go go go");
    }
    
    @Override
    public void makeEat() {
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    
    @Override
    public void makeEat() {
        System.out.println("Cat is eating");
    }
}

public class Main_Interface {
    public static void main(String[] args) {
        Animal2 dog = new Dog();
        dog.makeSound();
        dog.makeEat();
        
        Animal2 cat = new Cat();
        cat.makeSound();
        cat.makeEat();
    }
}
