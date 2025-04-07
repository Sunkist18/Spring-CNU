package cnu.core.member;

public class MemberApp {
    public static void main(String[] args) {
        // 회원가입
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", "memberA@gmail.com", "010-1234-5678");
        memberService.register(member);

        // 회원조회
        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
} 