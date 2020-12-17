package com.hyoj.share_recipe.service.member;

import com.hyoj.share_recipe.dao.MemberRepository;
import com.hyoj.share_recipe.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    //모든 회원 조회
    public List<MemberEntity> findAll(){

        List<MemberEntity> members = new ArrayList<>();

        memberRepository.findAll().forEach(e -> members.add(e));
        return members;
    }

    //아이디찾기
    public Optional<MemberEntity> findId(String email) {

        Optional<MemberEntity> memberId = memberRepository.findByEmail(email);

        return memberId;
    }


    //비번찾기
    public Optional<MemberEntity> findPass(String userid) {

        Optional<MemberEntity> memberPass = memberRepository.findByUserid(userid);

        return memberPass;
    }


    //회원가입
    public MemberEntity createMember(MemberEntity memberEntity){

        memberRepository.save(memberEntity);

        return memberEntity;
    }


    //회원탈퇴
    public void deleteMember(String userid){

        memberRepository.deleteById(userid);

    }

}
