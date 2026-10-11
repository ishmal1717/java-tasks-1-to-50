class Book {
    String title;
    boolean isIssued;

    public Book(String title) {
        this.title = title;
        this.isIssued = false;
    }
}

class Member {
    String name;
    int borrowedCount;

    public Member(String name) {
        this.name = name;
        this.borrowedCount = 0;
    }
}

class Library {
    public void borrowBook(Member member, Book book) {
        if (book.isIssued) {
            System.out.println("Failure: Book '" + book.title + "' is already issued.");
        } else if (member.borrowedCount >= 3) {
            System.out.println("Failure: Member " + member.name + " has already reached the maximum limit of 3 books.");
        } else {
            book.isIssued = true;
            member.borrowedCount++;
            System.out.println("Success: " + member.name + " borrowed '" + book.title + "'.");
        }
    }

    public void returnBook(Member member, Book book) {
        if (book.isIssued) {
            book.isIssued = false;
            member.borrowedCount--;
            System.out.println("Success: " + member.name + " returned '" + book.title + "'.");
        } else {
            System.out.println("Failure: Book '" + book.title + "' was not issued.");
        }
    }
}

public class task49 {
    public static void main(String[] args) {
        Library library = new Library();
        Member alice = new Member("Alice");

        Book b1 = new Book("Java Programming");
        Book b2 = new Book("Data Structures");
        Book b3 = new Book("Database Systems");
        Book b4 = new Book("Operating Systems");

        library.borrowBook(alice, b1);
        library.borrowBook(alice, b2);
        library.borrowBook(alice, b3);

        // Attempting to borrow a 4th book (should fail)
        library.borrowBook(alice, b4);

        // Attempting to borrow an already issued book with another member
        Member bob = new Member("Bob");
        library.borrowBook(bob, b1);

        // Return a book and borrow again
        library.returnBook(alice, b1);
        library.borrowBook(bob, b1);
    }
}