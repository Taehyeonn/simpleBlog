package com.example.simpleBlog.board.presentation;

import com.example.simpleBlog.board.application.BoardService;
import com.example.simpleBlog.board.dto.BoardInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/{board_id}")
    public ResponseEntity<BoardInfo> findBoardById(@PathVariable("board_id") final Long boardId) {
        BoardInfo response = boardService.findBoardById(boardId);
        return ResponseEntity.ok()
                .body(response);
    }
}