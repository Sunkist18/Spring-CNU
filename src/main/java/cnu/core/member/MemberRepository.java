package cnu.core.member;

public interface MemberRepository {
    void save (Member member);
    Member findById(Long memberId);
    void deleteById(Long memberId);
    void deleteAll();
} 