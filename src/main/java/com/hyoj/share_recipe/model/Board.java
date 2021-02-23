package com.hyoj.share_recipe.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Immutable // model 직접 수정 불가
@Table(name = "board_tbl")
@SecondaryTable(name = "reply", pkJoinColumns = @PrimaryKeyJoinColumn(name = "replyunq"))
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unq;

    private String userid;

    private String title;

    private String category;

    private String mat;

    private String recipe;

    @ColumnDefault("0")
    private int hits;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocalDateTime rdate;

    @Column(name = "replyunq", table = "reply")
    private int replyUnq;

    @Column(name = "replayer", table = "reply")
    private String replayer;

}
