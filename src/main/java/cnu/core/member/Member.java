package cnu.core.member;

public class Member {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

    public Member (Long id, String name, String email, String phoneNumber) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
} 