/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241108;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyAbs {
    public static int myAbs(int a)
    {
        return (a<0) ? -a : a;
    }
    
    public static long myAbs(long a)
    {
        return (a<0) ? -a : a;
    }
    
    public static double myAbs(double a)
    {
        return (a<0) ? -a : a;
    }
    
    public static float myAbs(float a)
    {
        return (a<0) ? -a : a;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Enter number: ");
        
        if (s.hasNextInt()) 
        {
            int inputInt = s.nextInt();
            System.out.println("GTTD cua " + inputInt + " la: " + myAbs(inputInt));
        } else if (s.hasNextLong()) 
        {
            long inputLong = s.nextLong();
            System.out.println("GTTD cua " + inputLong + " la: " + myAbs(inputLong));
        } else if (s.hasNextDouble()) 
        {
            double inputDouble = s.nextDouble();
            System.out.println("GTTD cua " + inputDouble + " la: " + myAbs(inputDouble));
        } else if (s.hasNextFloat()) 
        {
            float inputFloat = s.nextFloat();
            System.out.println("GTTD cua " + inputFloat + " la: " + myAbs(inputFloat));
        }
    }
}
