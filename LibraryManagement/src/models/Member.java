package models;

import enums.MemberType;

public class Member {
    private final int memberId;
    private String name;
    private String email;
    private String phoneNumber;
    private MemberType memberType;

    public Member(int memberId, String name,String email, String phoneNumber,MemberType memberType) {

        this.memberId=memberId;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.memberType=memberType;
    }
    public int getMemberId() {
        return memberId;
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
    public MemberType getMemberType() {
        return memberType;
    }
    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", memberType=" + memberType +
                '}';
    }
}