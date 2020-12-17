package com.hyoj.share_recipe.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Entity(name = "member_tbl")
public class MemberEntity {

    @Id
    @NotNull(message = "아이디를 입력해주세요.")
    private String userid;

    @Column
    @NotNull(message = "비밀번호를 입력해주세요.")
    private String pass;

    @Column
    @NotNull(message = "이름을 입력해주세요.")
    @Pattern(regexp = "^[가-힣]{2,5}$", message = "이름은 2~5 글자 사이의 한글로 입력해주세요.")
    private String name;

    @Column
    @NotNull(message = "이메일을 입력해주세요.")
    @Email(message = "잘못된 이메일 형식입니다.")
    private String email;

    @Column
    @ColumnDefault("0")
    private int admin;
}
