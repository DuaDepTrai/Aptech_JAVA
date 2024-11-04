/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

/**
 *
 * @author Admin
 */
public interface LibraryItem {
    String getTitle();
    boolean isAvaiable();
    void borrowItem();
    void returnItem();
}
