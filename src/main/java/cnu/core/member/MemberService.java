package cnu.core.member;

public interface MemberService {
    void register (Member member);
    Member findMember(Long memberId);
    void deleteMember (Long memberId);
    void deleteAllMembers();
} 