package com.hyoj.share_recipe.controller;

import com.hyoj.share_recipe.entity.MemberEntity;
import com.hyoj.share_recipe.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sharerecipe")
public class MemberController {

    @Autowired
    MemberService memberService;


    //모든 회원 조회
    @GetMapping("/member")
    public ResponseEntity<List<MemberEntity>> memberList(){
        List<MemberEntity> members = memberService.findAll();

        return new ResponseEntity<List<MemberEntity>>(members, HttpStatus.OK);
    }


    //이메일로 아이디찾기
    @GetMapping("/member/findid/{email}")
    public ResponseEntity<MemberEntity> findId(@PathVariable("email") String email){

        Optional<MemberEntity> memberId = memberService.findId(email);

        return new ResponseEntity<MemberEntity>(memberId.get(), HttpStatus.OK);
    }


    //아이디로 비번찾기
    @GetMapping("/member/findpass/{userid}")
    public ResponseEntity<MemberEntity> findPass(@PathVariable("userid") String userid){

        Optional<MemberEntity> memberPass = memberService.findPass(userid);

        return new ResponseEntity<MemberEntity>(memberPass.get(), HttpStatus.OK);
    }


    //회원가입
    @PostMapping("/member")
    public ResponseEntity<MemberEntity> createMember(@RequestBody MemberEntity memberEntity){

        return new ResponseEntity<MemberEntity>(memberService.createMember(memberEntity), HttpStatus.CREATED);
    }


    //회원탈퇴
    @DeleteMapping("/member/delete/{userid}")
    public ResponseEntity<Void> deleteMember(@PathVariable("userid") String userid){

        memberService.deleteMember(userid);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }



}
