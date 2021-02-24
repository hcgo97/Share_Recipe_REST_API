package com.hyoj.share_recipe.model;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity
@Immutable // model 직접 수정 불가
@Table(name = "reply")
@SecondaryTable(name = "board_tbl", pkJoinColumns = @PrimaryKeyJoinColumn(name = "unq"))
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int replyunq;

    private String replytext;

    private String replayer;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocalDateTime redate;

    @Column(name = "unq", table = "board_tbl", insertable = false, updatable = false)
    private int boardUnq;

}
