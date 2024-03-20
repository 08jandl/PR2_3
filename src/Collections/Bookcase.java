package Collections;

import java.util.List;

public class Bookcase {
    List<Book>books;

    public void addBook(Book book) {
        books.add(book);
    }

    public void showReadBooks() {
        for (Book book : books) {
            if (book.isFinished()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void showUnreadBooks() {
        for (Book book : books) {
            if (!book.isFinished()) {
                System.out.println(book.getTitle());
            }
        }
    }

}
