/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241113;

import java.util.function.BiFunction;
import java.util.function.Function;


/**
 *
 * @author Admin
 */
public class Ex1 {
    public void curryFunction()
    {
        BiFunction<Integer, Integer, Integer> adder=(x, y) -> x+y;
        Function<Integer, Function<Integer, Integer>>currier=x->y->adder.apply(x,y);
        Function<Integer, Integer>curried=currier.apply(5);
        
        System.out.printf("Curry:%d\n", curried.apply(5));
    }
    
    public void compose()
    {
        Function<Integer, Integer>addFour=(x)->x+4;
        Function<Integer,Integer>timesFive=(x)->x*5;
        Function<Integer,Integer>compose1=addFour.compose(timesFive);
        Function<Integer,Integer>compose2=timesFive.compose(addFour);
        System.out.printf("Times then add: %d\n", compose1.apply(7));
        System.out.printf("Add then times: %d\n", compose2.apply(7));
    }
    
    public static void main(String[] args) {
        new Ex1().curryFunction();
        new Ex1().compose();
    }
}
