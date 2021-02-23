package com.hyoj.share_recipe.mapper;

import com.hyoj.share_recipe.dto.*;
import com.hyoj.share_recipe.model.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);

    BoardListDto boardList(Board board);
    BoardDetailDto boardDetail(Board board);
    BoardWriteDto boardWrite(Board board);

}
