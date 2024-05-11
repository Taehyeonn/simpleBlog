package com.example.simpleBlog.member.application;

import com.example.simpleBlog.member.domain.Member;
import com.example.simpleBlog.member.domain.MemberInfo;
import com.example.simpleBlog.member.infra.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberInfo findById(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());
        return MemberInfo.from(member);
    }
}
