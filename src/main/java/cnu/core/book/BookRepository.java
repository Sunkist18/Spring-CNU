package cnu.core.book;

import java.util.List;

public interface BookRepository {
    void save (Book book);
    Book findById (Long bookId);
    List<Book> findAll();
} 