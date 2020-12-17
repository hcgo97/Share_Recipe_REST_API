package com.hyoj.share_recipe.service.board;

import com.hyoj.share_recipe.entity.BoardEntity;

public interface BoardService {

    //BoardList (List<>)
    Object boardList(BoardEntity boardEntity);

    Object boardDetail(BoardEntity boardEntity);

    Object boardModify(BoardEntity boardEntity);

    Object boardDelete(BoardEntity boardEntity);

    //인기게시판
    Object topBoard(BoardEntity boardEntity);


    //댓글
    Object replyList(BoardEntity boardEntity);

    Object replyDelete(BoardEntity boardEntity);

}
