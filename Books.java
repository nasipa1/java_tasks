import java.util.Objects;
import java.util.Scanner;

public class Books {
    private String title;
    private String author;
    private boolean isAvailable;

    public Books(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return title + " " + author + " " + isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return title.equals(books.title) && author.equals(books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

class Library {
    private Books[] books;
    private int indexAvailable = 0;

    public Library() {
        books = new Books[10];
    }

    public void addBooks(String title, String author, boolean isAvailable) {
        if (indexAvailable < books.length) {
            books[indexAvailable++] = new Books(title, author, isAvailable);
        } else {
            System.out.println("Library is full");
        }
    }

    public void borrowBook(String title) {
        for (Books book : books) {
            if (book != null && book.getTitle().equals(title)) {
                if (book.getIsAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Borrowed!!!");
                } else {
                    System.out.println("Not Available!!!");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(String title) {
        for (Books book : books) {
            if (book != null && book.getTitle().equals(title)) {
                if (!book.getIsAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is already available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void replaceBook(String title, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                books[i] = new Books(title, author, true);
                return;
            }
        }
    }

    public void replaceBook(Books oldBook, Books newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(oldBook)) {
                books[i] = newBook;
                return;
            }
        }
    }

    public void viewAvailableBooks() {
        for (Books book : books) {
            if (book != null && book.getIsAvailable()) {
                System.out.println(book);
            }
        }
    }
}

class BookMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        library.addBooks("Java", "Java", true);
        library.addBooks("Python", "Python", true);
        library.addBooks("C", "C", true);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.viewAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    library.borrowBook(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    library.returnBook(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("BYEEE");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
