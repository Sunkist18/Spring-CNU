package cnu.core.book;

import cnu.core.member.Member;
import cnu.core.notification.NotificationService;
import cnu.core.notification.SmsNotificationService;
import java.util.List;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository = new MemoryBookRepository();
    private final NotificationService notificationService = new SmsNotificationService();

    @Override
    public void registerBook (Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findBook (Long bookId) {
        return bookRepository.findById(bookId);
    }

    /**
     * 실제로 알람 발송을 위해 rentBook 메서드를 이렇게 구성하는건 좋은 구조가 아니다. (트랜잭션, 지연처리 이슈 등등..)
     * 구조를 한 눈에 보기위해 단순하게 작성하였다.
     */
    @Override
    public void rentBook (Member member, Book book) {
        book.setQuantity(book.getQuantity()-1);
        bookRepository.save(book);
        notificationService.send(member, book);
    }

    @Override
    public void returnBook (Book book) {
        book.setQuantity(book.getQuantity()+1);
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
} 