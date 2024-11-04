/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

/**
 *
 * @author Admin
 */
public class LibraryMember {
    private String memberName;
    private Book borrowBook;
    
    public LibraryMember() {}
    
    public LibraryMember(String memberName) {
        this.memberName = memberName;
        this.borrowBook = null;
    }
    
    public String getMemmberName() {
        return memberName;
    }
    
    public void borrowBook(Book book) {
        if (hasBorrowedBook()) {
            System.out.println(memberName + " can not borrow anymore");
        }else if (borrowBook == null) {
            if (book.isAvaiable()) {
                book.borrow();
                borrowBook = book;
                System.out.println(memberName + " borrowed book: " + book.getTitle());
            } else {
                System.out.println("Book: " + book.getTitle() + " is not avaiable");
            }
        } else {
            System.out.println(memberName + "has borrowed 1 book");
        }        
    }
    
    public void returnBook() {
        if (borrowBook != null) {
            borrowBook.returnBook();
            System.out.println(memberName + " return book: " + borrowBook.getTitle());
            borrowBook = null;
        } else {
            System.out.println(memberName + " has not borrowed any book");
        }
    }
    
    public boolean hasBorrowedBook() {
        return borrowBook != null;
    }
}
