package com.hyoj.share_recipe.service;

import com.hyoj.share_recipe.repository.BoardRepository;
import com.hyoj.share_recipe.model.Board;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public Object boardList(Board board) {

        return boardRepository.findAll();
    }

    public Object boardDetail(Board board) {
        return null;
    }

    public Object boardModify(Board board) {
        return null;
    }

    public Object boardDelete(Board board) {
        return null;
    }

    public Object popularBoard(Board board) {
        return null;
    }

}
