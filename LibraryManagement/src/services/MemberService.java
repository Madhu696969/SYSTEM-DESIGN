package services;

import Repository.MemberRepository;
import models.Member;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public void addMember(Member member) {
        memberRepository.add(member);
    }
    public Member getMember(int memberId) {
        return memberRepository.get(memberId);
    }
    public void removeMember(int memberId) {
        memberRepository.remove(memberId);
    }
    public boolean containsMember(int memberId) {
        return memberRepository.contains(memberId);
    }
}