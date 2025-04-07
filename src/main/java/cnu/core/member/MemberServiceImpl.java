package cnu.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void register (Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember (Long memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public void deleteMember (Long memberId) {
        memberRepository.deleteById(memberId);
    }

    @Override
    public void deleteAllMembers() {
        memberRepository.deleteAll();
    }
} 