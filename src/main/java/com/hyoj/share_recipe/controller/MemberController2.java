//package com.hyoj.share_recipe.controller;
//
//import com.hyoj.share_recipe.entity.MemberEntity;
//import com.hyoj.share_recipe.service.member.MemberService2Impl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/sharerecipe")
//public class MemberController2 {
//
//    @Autowired
//    private MemberService2Impl memberService;
//
//
//    //회원가입
//    @PostMapping("/member")
//    public Map<String, Object> signIn(@RequestBody MemberEntity memberEntity){
//
//        return memberService.createMember(memberEntity);
//    }
//
//
//
//
//
////    @GetMapping("/member/{userid}")
////    public Object passModify(@PathVariable("userid") String userid, Se@RequestBody MemberEntity memberEntity){
////
////        return memberService.modifyPass(userid, pass);
////
////
////    }
//
//
//    //회원탈퇴
//    @DeleteMapping("/member/{userid}")
//    public String deleteMember(@PathVariable("userid") String userid){
//
//        return memberService.deleteMember(userid);
//    }
//
//
//    //아이디찾기
//    @GetMapping("/member/userid/{email}")
//    public Map<String, Object> findId(@PathVariable("email") String email){
//
//        return memberService.findId(email);
//    }
//
//
//    //비번찾기
//    @GetMapping("/member/pass/{userid}")
//    public Map<String, Object> findPass(@PathVariable("userid") String userid){
//
//        return memberService.findPass(userid);
//    }
//
//
//}
