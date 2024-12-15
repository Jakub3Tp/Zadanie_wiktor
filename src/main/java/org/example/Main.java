package org.example;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new Library();

        // Dodawanie książek
        library.addBook("1984", "George Orwell", "1234567890");
        library.addBook("To Kill a Mockingbird", "Harper Lee", "0987654321");
        library.addBook("Brave New World", "Aldous Huxley", "1122334455");

        // Wyświetlanie dostępnych książek
        System.out.println("Available books:");
        System.out.println(library.listAvailableBooks());

        // Wypożyczanie książki
        System.out.println("\nBorrowing book with ISBN 1234567890:");
        System.out.println(library.borrowBook("1234567890") ? "Success" : "Failed");

        // Próba ponownego wypożyczenia tej samej książki
        System.out.println("Borrowing book with ISBN 1234567890 again:");
        System.out.println(library.borrowBook("1234567890") ? "Success" : "Failed");

        // Wyświetlanie dostępnych książek
        System.out.println("\nAvailable books:");
        System.out.println(library.listAvailableBooks());

        // Zwracanie książki
        System.out.println("\nReturning book with ISBN 1234567890:");
        System.out.println(library.returnBook("1234567890") ? "Success" : "Failed");

        // Usuwanie książki
        System.out.println("\nRemoving book with ISBN 0987654321:");
        System.out.println(library.removeBook("0987654321") ? "Removed" : "Not Found");

        // Wyświetlanie książek po usunięciu
        System.out.println("\nAvailable books:");
        System.out.println(library.listAvailableBooks());
    }
}
