package cnu.core.book;

import java.util.*;

public class MemoryBookRepository implements BookRepository{
    private static Map<Long, Book> store = new HashMap<>();

    @Override
    public void save (Book book) {
        store.put(book.getId(), book);
    }

    @Override
    public Book findById(Long bookId) {
        return store.get(bookId);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(store.values());
    }
} 