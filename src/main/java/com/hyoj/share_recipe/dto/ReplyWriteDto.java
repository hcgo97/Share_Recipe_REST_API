package com.hyoj.share_recipe.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class ReplyWriteDto {

    @NotNull(message = "잘못된 요청입니다.")
    private int replyUnq;

    @NotNull(message = "댓글을 입력해주세요.")
    private String replyText;

    @NotNull(message = "로그인 후 댓글 작성이 가능합니다.")
    private String replayer;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime redate;

    @JsonIgnore
    private int boardUnq;

}
