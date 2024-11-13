/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT8.customer;

/**
 *
 * @author Admin
 */
public class CDCreator {
    private int nextMovie = 0;
    private int nextMovieCode = 0;
    private int nextAlbum = 0;
    private int nextAlbumCode = 0;
    
    private BT8.movies.CompactDisc[] vcd;
    private BT8.music.CompactDisc[] cd;
    
    public CDCreator(int movieCapacity, int musicCapacity) {
        vcd = new BT8.movies.CompactDisc[movieCapacity];
        cd = new BT8.music.CompactDisc[musicCapacity];
    }
    
    public void addMovieCD(String title, double price, int code) {
        if (nextMovie < vcd.length) {
            vcd[nextMovie] = new BT8.movies.CompactDisc(title, price, code);
            nextMovie++;
            nextMovieCode++;
        } else {
            System.out.println("No more space for new CD");
        }
    }
    
    public void addMusicCD(String title, String artist, double price, int code) {
        if (nextAlbum < cd.length) {
            cd[nextAlbum] = new BT8.music.CompactDisc(title, artist, price, code);
            nextAlbum++;
            nextAlbumCode++;
        } else {
            System.out.println("No more space for new CD");
        }
    }
    
    public void displayAllMovieCDs() {
        for (int i=0; i< nextMovie; i++) {
            System.out.println(vcd[i]);
        }
    }
    public void displayAllMusicCDs() {
        for (int i=0; i<nextAlbum; i++) {
            System.out.println(cd[i]);
        }
    }
}
