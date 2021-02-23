package com.hyoj.share_recipe.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class BoardWriteDto {

    @JsonIgnore
    private int unq;

    @NotNull(message = "로그인 후 글 작성이 가능합니다.")
    private String userid;

    @NotNull(message = "제목을 입력해주세요.")
    private String title;

    @NotNull(message = "카테고리를 선택해주세요.")
    private String category;

    @NotNull(message = "재료를 선택해주세요.")
    private String mat;

    @NotNull(message = "내용을 입력해주세요.")
    private String recipe;

    @ColumnDefault("0")
    private int hits;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime rdate;

}
