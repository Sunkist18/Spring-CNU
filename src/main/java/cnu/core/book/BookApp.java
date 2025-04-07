package cnu.core.book;

import java.util.List;

public class BookApp {
    public static void main(String[] args) {
        // 책 추가
        BookService bookService = new BookServiceImpl();
        Book book1 = new Book(1L, "title1", "author1", 3);
        bookService.registerBook(book1);

        Book book2 = new Book(2L, "title2", "author2", 4);
        bookService.registerBook(book2);

        // 책 조회
        Book findBook1 = bookService.findBook(1L);
        System.out.println("findBook1 = " + findBook1.getTitle());

        Book findBook2 = bookService.findBook(2L);
        System.out.println("findBook2 = " + findBook2.getTitle());

        // 책 전제 조회
        List<Book> allBooks = bookService.findAllBooks();
        allBooks.forEach(book -> System.out.println("title = " + book.getTitle()));
    }
} 