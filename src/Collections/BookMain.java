package Collections;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Fische sekrieren für Anfänger", true, 2.5));

        for (Book book : bookList) {
            System.out.println(book);
        }

        for (Book book : bookList) {
            System.out.println(book.getStars());
        }


        // BOOKCASE

        Bookcase bookcase = new Bookcase();
        bookcase.books = new ArrayList<>();
        bookcase.books.addAll(bookList);

        bookcase.showReadBooks();
        System.out.println("---------------------");
        bookcase.showUnreadBooks();
    }
}
