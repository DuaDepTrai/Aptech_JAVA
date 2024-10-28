/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_241028;

/**
 *
 * @author Admin
 */
public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Bat dau khoi try");
            double result = 10.0/0;
            System.out.println("Ket qua: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ngoai le: " + e.getMessage());
        } finally {
            System.out.println("Khoi finally luon duoc thuc thi");
        }
    }
}
