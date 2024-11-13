/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241114.Library.Customer;

/**
 *
 * @author Admin
 */
public class BookCreator {
    private int nextComic = 0;
    private int nextNovel = 0;
    
    private Exercise.Ex_241114.Library.Comics.Books[] comic;
    private Exercise.Ex_241114.Library.Novels.Books[] novel;
    
    public BookCreator(int comicCapacity, int novelCapacity) {
        comic = new Exercise.Ex_241114.Library.Comics.Books[comicCapacity];
        novel = new Exercise.Ex_241114.Library.Novels.Books[novelCapacity];
    }
    
    public void addComic(String title, String author, String type, double price) {
        if (nextComic < comic.length) {
            comic[nextComic] = new Exercise.Ex_241114.Library.Comics.Books(title, author, type, price);
            nextComic++;
        } else {
            System.out.println("No space for new book");
        }
    }
    
    public void addNovel(String title, String author, String type, double price) {
        if (nextNovel < novel.length) {
            novel[nextNovel] = new Exercise.Ex_241114.Library.Novels.Books(title, author, type, price);
            nextNovel++;
        } else {
            System.out.println("No space for new book");
        }
    }
    
    public void displayAllComics() {
        for (int i=0; i< nextComic; i++) {
            System.out.println(comic[i]);
        }
    }
    
    public void displayAllNovels() {
        for (int i=0; i< nextNovel; i++) {
            System.out.println(novel[i]);
        }
    }
}
