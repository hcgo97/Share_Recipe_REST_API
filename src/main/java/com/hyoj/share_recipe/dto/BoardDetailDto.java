package com.hyoj.share_recipe.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDetailDto {

    private int unq;

    private String userid;

    private String title;

    private String category;

    private String mat;

    private String recipe;

    private int hits;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rdate;

}
