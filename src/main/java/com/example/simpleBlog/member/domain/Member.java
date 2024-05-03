package com.example.simpleBlog.member.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String password;

    @Column(nullable = false, length = 10)
    private String nickname;

    @Column
    private String socialId; //카카오 로그인시, 이메일 로그인 유저는 null

    public Member(String email, String password, String nickname, String socialId) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.socialId = socialId;
    }
}