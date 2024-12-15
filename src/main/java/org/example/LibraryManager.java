package org.example;

import java.util.List;

public interface LibraryManager {
    void addBook(String title, String author, String isbn);

    boolean removeBook(String isbn);

    List<String> searchByTitle(String title);

    List<String> searchByAuthor(String author);

    boolean borrowBook(String isbn);

    boolean returnBook(String isbn);

    List<String> listAvailableBooks();
}
