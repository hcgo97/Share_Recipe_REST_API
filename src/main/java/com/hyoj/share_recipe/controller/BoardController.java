package com.hyoj.share_recipe.controller;

import com.hyoj.share_recipe.model.Board;
import com.hyoj.share_recipe.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/shareRecipe")
public class BoardController {


    private final BoardService boardService;


//    public BoardController(BoardServiceImpl boardService){
//        this.boardService = boardService;
//    }

    //BoardList
    @GetMapping("/board")
    public Object boardList(@RequestBody Board board){

        return boardService.boardList(board);
    }

}
