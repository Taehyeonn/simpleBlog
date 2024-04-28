package com.example.simpleBlog.board.application;

import com.example.simpleBlog.board.domain.Board;
import com.example.simpleBlog.board.dto.BoardInfo;
import com.example.simpleBlog.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    public final BoardRepository boardRepository;

    public BoardInfo findBoardById(Long boardId) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> new IllegalArgumentException());
        return BoardInfo.from(board);
    }
}