package com.hyoj.share_recipe.controller;

import com.hyoj.share_recipe.model.Member;
import com.hyoj.share_recipe.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/shareRecipe")
public class MemberController {

    @Autowired
    MemberService memberService;


    //모든 회원 조회
    @GetMapping("/member")
    public ResponseEntity<List<Member>> memberList(){
        List<Member> members = memberService.findAll();

        return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
    }


    //이메일로 아이디찾기
    @GetMapping("/member/findid/{email}")
    public ResponseEntity<Member> findId(@PathVariable("email") String email){

        Optional<Member> memberId = memberService.findId(email);

        return new ResponseEntity<Member>(memberId.get(), HttpStatus.OK);
    }


    //아이디로 비번찾기
    @GetMapping("/member/findpass/{userid}")
    public ResponseEntity<Member> findPass(@PathVariable("userid") String userid){

        Optional<Member> memberPass = memberService.findPass(userid);

        return new ResponseEntity<Member>(memberPass.get(), HttpStatus.OK);
    }


    //회원가입
    @PostMapping("/member")
    public ResponseEntity<Member> createMember(@RequestBody Member member){

        return new ResponseEntity<Member>(memberService.createMember(member), HttpStatus.CREATED);
    }


    //회원탈퇴
    @DeleteMapping("/member/delete/{userid}")
    public ResponseEntity<Void> deleteMember(@PathVariable("userid") String userid){

        memberService.deleteMember(userid);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }



}
