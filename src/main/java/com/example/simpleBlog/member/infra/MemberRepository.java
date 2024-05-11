package com.example.simpleBlog.member.infra;

import com.example.simpleBlog.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
