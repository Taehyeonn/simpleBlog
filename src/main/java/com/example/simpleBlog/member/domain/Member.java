package com.example.simpleBlog.member.domain;

import com.example.simpleBlog.board.domain.Board;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Board> boards = new ArrayList<>();

    public Member(String email, String password, String nickname, String socialId) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.socialId = socialId;
    }
}