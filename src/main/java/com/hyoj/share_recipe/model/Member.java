package com.hyoj.share_recipe.model;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Immutable // model 직접 수정 불가
@Table(name = "member_tbl")
public class Member {

    @Id
    private String userid;

    private String pass;

    private String name;

    private String email;

}
