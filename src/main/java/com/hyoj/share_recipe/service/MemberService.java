package com.hyoj.share_recipe.service;

import com.hyoj.share_recipe.repository.MemberRepository;
import com.hyoj.share_recipe.model.Member;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Slf4j
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    //모든 회원 조회
    public List<Member> findAll(){

        List<Member> members = new ArrayList<>();

        memberRepository.findAll().forEach(e -> members.add(e));
        return members;
    }

    //아이디찾기
    public Optional<Member> findId(String email) {

        Optional<Member> memberId = memberRepository.findByEmail(email);

        return memberId;
    }


    //비번찾기
    public Optional<Member> findPass(String userid) {

        Optional<Member> memberPass = memberRepository.findByUserid(userid);

        return memberPass;
    }


    //회원가입
    public Member createMember(Member member){

        memberRepository.save(member);

        return member;
    }


    //회원탈퇴
    public void deleteMember(String userid){

        memberRepository.deleteById(userid);

    }

}
