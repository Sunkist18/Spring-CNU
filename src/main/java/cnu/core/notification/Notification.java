package cnu.core.notification;

public class Notification {
    // 이메일 or SMS
    private String recipients;
    private NotificationPlatform platform;
    private String message;

    public Notification(String recipients, NotificationPlatform platform, String message) {
        this.recipients = recipients;
        this.platform = platform;
        this.message = message;
    }
} 