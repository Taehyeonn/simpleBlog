package com.example.simpleBlog.member.presentation;

import com.example.simpleBlog.member.application.MemberService;
import com.example.simpleBlog.member.domain.MemberInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{member_id}")
    public ResponseEntity<MemberInfo> findById(@PathVariable("member_id") final Long memberId) {
        MemberInfo response = memberService.findById(memberId);
        return ResponseEntity.ok()
                .body(response);
    }
}
