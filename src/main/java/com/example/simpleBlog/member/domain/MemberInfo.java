package com.example.simpleBlog.member.domain;

public record MemberInfo(Long id,
                         String email,
                         String nickname) {

    public static MemberInfo from(Member member) {
        return new MemberInfo(member.getId(), member.getEmail(), member.getNickname());
    }
}
