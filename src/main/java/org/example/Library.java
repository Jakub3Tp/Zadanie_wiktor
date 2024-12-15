package org.example;
import java.util.ArrayList;
import java.util.List;
class Library implements LibraryManager {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }

    @Override
    public boolean removeBook(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public List<String> searchByTitle(String title) {
        List<String> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book.toString());
            }
        }
        return result;
    }

    @Override
    public List<String> searchByAuthor(String author) {
        List<String> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book.toString());
            }
        }
        return result;
    }

    @Override
    public boolean borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> listAvailableBooks() {
        List<String> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                result.add(book.toString());
            }
        }
        return result;
    }
}