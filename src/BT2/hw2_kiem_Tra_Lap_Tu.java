/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.*;

/**
 *
 * @author Admin
 */
public class hw2_kiem_Tra_Lap_Tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đoạn văn cần kiểm tra
        System.out.println("Nhap doan van can kiem tra: ");
        String paragraph = scanner.nextLine();

        // Tách câu dựa vào dấu chấm '.'
        String[] sentences = paragraph.split("\\.");

        // Kiểm tra từ lặp giữa các câu liên tiếp
        for (int i = 0; i < sentences.length - 1; i++) {
            // Tách từ trong hai câu liên tiếp
            String[] words1 = sentences[i].trim().toLowerCase().split("\\s+");
            String[] words2 = sentences[i + 1].trim().toLowerCase().split("\\s+");

            // Đếm số lần xuất hiện của các từ trong hai câu liên tiếp
            Map<String, Integer> wordCount = new HashMap<>();

            // Đếm từ trong câu thứ nhất
            for (String word : words1) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            // Đếm từ trong câu thứ hai
            for (String word : words2) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            // Kiểm tra từ nào xuất hiện ít nhất 3 lần
            boolean foundRepetition = false;
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() >= 3) {
                    System.out.println("Tu bi lap: " + entry.getKey());
                    foundRepetition = true;
                }
            }

            if (!foundRepetition) {
                System.out.println("Khong co tu nao bi lap trong 2 cau: \"" 
                                   + sentences[i].trim() + "\" va \"" 
                                   + sentences[i + 1].trim() + "\"");
            }
        }

        scanner.close();
    }
}