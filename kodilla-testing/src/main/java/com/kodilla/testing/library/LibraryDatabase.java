package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //List books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for lirbaryUser
    //returns true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
