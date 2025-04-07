package cnu.core.notification;

import cnu.core.book.Book;
import cnu.core.member.Member;

public interface NotificationService {
    Notification send (Member member, Book book);
} 