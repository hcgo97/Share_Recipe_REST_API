package com.hyoj.share_recipe.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity(name = "reply")
public class ReplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "잘못된 요청입니다.")
    private int replyunq;

    @Column
    @NotNull(message = "댓글을 입력해주세요.")
    private String replytext;

    @Column
    @NotNull(message = "로그인 후 댓글 작성이 가능합니다.")
    private String replyer;

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date redate;

    @Column
    @NotNull(message = "잘못된 요청입니다.")
    private int board_unq;

}
