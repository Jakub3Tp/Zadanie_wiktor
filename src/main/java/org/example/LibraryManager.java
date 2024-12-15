package org.example;

import java.util.List;

public interface LibraryManager {
    // Dodaje nową książkę do biblioteki
    void addBook(String title, String author, String isbn);
    // Usuwa książkę na podstawie ISBN
    boolean removeBook(String isbn);
    // Wyszukuje książki na podstawie tytułu
    List<String> searchByTitle(String title);
    // Wyszukuje książki na podstawie autora
    List<String> searchByAuthor(String author);
    // Wypożycza książkę na podstawie ISBN
    boolean borrowBook(String isbn);
    // Zwraca książkę na podstawie ISBN
    boolean returnBook(String isbn);
    // Wyświetla wszystkie dostępne książki
    List<String> listAvailableBooks();
}
