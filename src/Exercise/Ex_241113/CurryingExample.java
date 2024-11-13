/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241113;
import java.util.function.Function;

/**
 *
 * @author Admin
 */
public class CurryingExample {
    public static Function<Integer, Function<Integer, Integer>> add = a -> b -> a+b;
    public static void main(String[] args) {
        Function<Integer, Integer> addFive = add.apply(5);
        int result = addFive.apply(3);
        System.out.println("5 + 3 = " + result);
    }
}


