/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryinventory;

/**
 *
 * @author sbc-student
 */
public class Books {
    public final String bookISBN;
    public final String bookAuthor;
    public final String bookTitle;
    public final String bookTotalnumofcopies;

    public Books(String bookISBN, String bookAuthor, String bookTitle, String bookTotalnumofcopies) {
        this.bookISBN = bookISBN;
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookTotalnumofcopies = bookTotalnumofcopies;
    }
   
    
    
    
    
    @Override
    public String toString() {
        return "Books{" + "bookISBN=" + bookISBN + ", bookAuthor=" + bookAuthor + ", bookTitle=" + bookTitle + ", bookTotalnumofcopies=" + bookTotalnumofcopies + '}';
    }
            
            
            
}
