package com.hyoj.share_recipe.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity(name = "board_tbl")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "잘못된 요청입니다.")
    private int unq;

    @Column
    @NotNull(message = "로그인 후 글 작성이 가능합니다.")
    private String userid;

    @Column
    @NotNull(message = "제목을 입력해주세요.")
    private String title;

    @Column
    @NotNull(message = "카테고리를 선택해주세요.")
    private String category;

    @Column
    @NotNull(message = "재료를 선택해주세요.")
    private String mat;

    @Column
    @NotNull(message = "내용을 입력해주세요.")
    private String recipe;

    @Column
    @ColumnDefault("0")
    private int hits;

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date rdate;

}
