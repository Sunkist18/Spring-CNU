package cnu.core.book;

import cnu.core.member.Member;
import java.util.List;

public interface BookService {
    void registerBook (Book book);
    Book findBook (Long bookId);
    void returnBook (Book book);
    void rentBook (Member member, Book book);
    List<Book> findAllBooks();
} 