package com.hyoj.share_recipe.model;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Immutable // model 직접 수정 불가
@Table(name = "reply")
@SecondaryTable(name = "board_tbl", pkJoinColumns = @PrimaryKeyJoinColumn(name = "unq"))
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int replyUnq;

    private String replyText;

    private String replayer;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date redate;

    @Column(name = "unq", table = "board_tbl")
    private int boardUnq;

}
