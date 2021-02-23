package com.hyoj.share_recipe.mapper;

import com.hyoj.share_recipe.dto.ReplyWriteDto;
import com.hyoj.share_recipe.model.Reply;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReplyMapper {

    ReplyMapper INSTANCE = Mappers.getMapper(ReplyMapper.class);

    ReplyWriteDto replyWrite(Reply reply);

}
