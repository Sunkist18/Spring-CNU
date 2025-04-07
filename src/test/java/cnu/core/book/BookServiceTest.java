package cnu.core.book;

import cnu.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BookServiceTest {
    BookService bookService = new BookServiceImpl();

    @Test
    @DisplayName("책을 등록하고 조회한다.")
    void registerBook() {
        //given
        Book book = new Book(1L, "title1", "author1", 3);

        //when
        bookService.registerBook(book);
        Book findBook = bookService.findBook(book.getId());

        //then
        assertThat(book.getTitle()).isEqualTo(findBook.getTitle());
    }

    @Test
    @DisplayName("모든 책을 조회한다.")
    void findAllBooks() {
        //given
        Book book1 = new Book(1L, "title1", "author1", 3);
        Book book2 = new Book(2L, "title2", "author2", 4);

        //when
        bookService.registerBook(book1);
        bookService.registerBook(book2);
        List<Book> bookList = bookService.findAllBooks();

        //then
        assertThat(bookList.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("회원이 책을 빌리면 책의 수량이 한 권 감소한다.")
    void rentBook() {
        //given
        Member member = new Member(1L, "memberA", "memberA@gmail.com", "010-1234-5678");
        Book book = new Book(1L, "title1", "author1", 3);
        bookService.registerBook(book);

        //when
        bookService.rentBook(member, book);

        //then
        assertThat(book.getQuantity()).isEqualTo(2);
    }

    @Test
    @DisplayName("회원이 책을 반납하면 책의 수량이 한 권 증가한다.")
    void returnBook() {
        //given
        Book book = new Book(1L, "title1", "author1", 3);
        bookService.registerBook(book);

        //when
        bookService.returnBook(book);

        //then
        assertThat(book.getQuantity()).isEqualTo(4);
    }
} 