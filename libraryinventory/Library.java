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
public class Library {
    public String bookList;
    public String patronList;

    public Library(String bookList, String patronList) {
        this.bookList = bookList;
        this.patronList = patronList;
    }
    public void addPatron(Patron patron) {
        
        patron.add(patron);
    }

    public void addBook(Book book) {
        
        books.add(book);
    }
    
    public Optional<Book> searchBook(String searchKey) {
       
        boolean bookFound = false;
       
        for (Book book : BookMap.values()) {
            
            if (book.title.contains(searchKey)) {
                System.out.println(book);
                bookFound = true;
            }
        }
        
        if (bookFound) {
            return Optional.empty();
        } else {
            System.out.println("No matching book found");
            return Optional.empty();
        }

    }
    
    
    @Override
    public String toString() {
        return "Library{" + "bookList=" + bookList + ", patrongList=" + patronList + '}';
    }


    
}
