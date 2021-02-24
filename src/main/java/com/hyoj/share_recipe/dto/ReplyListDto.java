package com.hyoj.share_recipe.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReplyListDto {

    private int replyunq;

    private String replytext;

    private String replayer;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime redate;

    @JsonIgnore
    private int boardUnq;

}
