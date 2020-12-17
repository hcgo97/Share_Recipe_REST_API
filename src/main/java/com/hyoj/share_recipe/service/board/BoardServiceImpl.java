package com.hyoj.share_recipe.service.board;

import com.hyoj.share_recipe.dao.BoardRepository;
import com.hyoj.share_recipe.entity.BoardEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Object boardList(BoardEntity boardEntity) {

        return boardRepository.findAll();
    }

    @Override
    public Object boardDetail(BoardEntity boardEntity) {
        return null;
    }

    @Override
    public Object boardModify(BoardEntity boardEntity) {
        return null;
    }

    @Override
    public Object boardDelete(BoardEntity boardEntity) {
        return null;
    }

    @Override
    public Object topBoard(BoardEntity boardEntity) {
        return null;
    }

    @Override
    public Object replyList(BoardEntity boardEntity) {
        return null;
    }

    @Override
    public Object replyDelete(BoardEntity boardEntity) {
        return null;
    }

}
