package com.example.simpleBlog.board.repository;

import com.example.simpleBlog.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
