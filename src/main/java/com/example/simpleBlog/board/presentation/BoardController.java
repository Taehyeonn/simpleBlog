package com.example.simpleBlog.board.presentation;

import com.example.simpleBlog.board.application.BoardService;
import com.example.simpleBlog.board.dto.BoardInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/{board_id}")
    public String findBoardById(@PathVariable("board_id") final Long boardId,
                                Model model) {

        BoardInfo response = boardService.findBoardById(boardId);
        model.addAttribute("boardInfo", response);
        return "view";
    }
}