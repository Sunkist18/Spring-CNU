package cnu.core.notification;

import cnu.core.book.Book;
import cnu.core.member.Member;
import java.time.LocalDate;

public class SmsNotificationService implements NotificationService{
    @Override
    public Notification send (Member member, Book book) {
        String message = member.getName()
                .concat(" 회원님 ")
                .concat(book.getTitle())
                .concat(" 대여하였습니다.\n")
                .concat("일시 : ")
                .concat(LocalDate.now().toString())
                .concat("\n")
                .concat("Platform : ")
                .concat(NotificationPlatform.MOBILE.toString());

        // SMS 전송로직
        System.out.println(message);

        return new Notification(member.getPhoneNumber(), NotificationPlatform.MOBILE, message);
    }
} 