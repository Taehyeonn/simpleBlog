package com.example.simpleBlog.board.dto;

import com.example.simpleBlog.board.domain.Board;

public record BoardInfo(Long id,
                        String title,
                        String content) {

    public static BoardInfo from(Board board) {
        return new BoardInfo(board.getId(), board.getTitle(), board.getContent());
    }
}