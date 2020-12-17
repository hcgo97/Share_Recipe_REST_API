package com.hyoj.share_recipe.controller;

import com.hyoj.share_recipe.entity.BoardEntity;
import com.hyoj.share_recipe.service.board.BoardServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/sharerecipe")
public class BoardController {


    private final BoardServiceImpl boardService;


//    public BoardController(BoardServiceImpl boardService){
//        this.boardService = boardService;
//    }

    //BoardList
    @GetMapping("/board")
    public Object boardList(@RequestBody BoardEntity boardEntity){

        return boardService.boardList(boardEntity);
    }

}
