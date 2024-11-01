/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241030;
import java.util.function.Function;

/**
 *
 * @author Admin
 */
public class Example {
    public static void main(String[] args) {
        System.out.println(tinh(x->x*x).apply(10.0));
    }
    
    public static Function<Double, Double> tinh(Function<Double, Double> f) {
        return f;
    }
    
}
