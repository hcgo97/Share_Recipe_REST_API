package com.hyoj.share_recipe.mapper;

import com.hyoj.share_recipe.dto.LoginDto;
import com.hyoj.share_recipe.dto.JoinDto;
import com.hyoj.share_recipe.model.Member;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    LoginDto loginMember(Member member);
    JoinDto joinMember(Member member);

}
