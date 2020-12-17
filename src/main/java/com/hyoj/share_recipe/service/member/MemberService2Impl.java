//package com.hyoj.share_recipe.service.member;
//
//import com.hyoj.share_recipe.dao.MemberRepository;
//import com.hyoj.share_recipe.entity.MemberEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//@Service
//public class MemberService2Impl implements MemberService2 {
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    //회원가입
//    @Override
//    public Map<String, Object> createMember(MemberEntity memberEntity) {
//        Map<String, Object> response = new HashMap<>();
//
//        int count = memberRepository.countByUserid(memberEntity.getUserid());
//
//        if (count == 1) {
//
//            response.put("result", "FAIL");
//            response.put("data", "중복된 아이디입니다.");
//
//        } else {
//
//            response.put("result", "SUCCESS");
//            response.put("data", memberRepository.save(memberEntity));
//        }
//
//        return response;
//    }
//
//
//    //회원탈퇴 - 없는아디입력시 exception 구현해야함
//    @Override
//    public String deleteMember(String userid) {
//
//        String msg = "삭제완료";
//        memberRepository.deleteById(userid);
//
//        return msg;
//
//    }
//
//
////    //비번변경
////    @Override
////    public Object modifyPass(String userid) {
////
////        MemberEntity id = memberRepository.findByUserid(userid);
////
////        if(id == null){
////
////            String msg = "존재하지 않는 아이디입니다.";
////            return msg;
////
////        } else{
////
////            id.setPass(pass);
////            return id;
////        }
////    }
//
//    //이메일로 아이디찾기
//    @Override
//    public Map<String, Object> findId(String email) {
//        Map<String, Object> response= new HashMap<>();
//
//        Optional<MemberEntity> member = memberRepository.findByEmail(email);
//
//        if(member.isPresent()) {
//            response.put("result", "SUCCESS");
//            response.put("userid", member.get().getUserid());
//        }else{
//            response.put("result", "FAIL");
//            response.put("message", "일치하는 회원 정보가 없습니다.");
//
//        }
//
//        return response;
//    }
//
//
//    //아이디로 비번찾기
//    @Override
//    public Map<String, Object> findPass(String userid) {
//        Map<String, Object> response= new HashMap<>();
//
//        Optional<MemberEntity> member = memberRepository.findByUserid(userid);
//
//        if(member.isPresent()) {
//            response.put("result", "SUCCESS");
//            response.put("pass", member.get().getPass());
//        }else{
//            response.put("result", "FAIL");
//            response.put("message", "일치하는 회원 정보가 없습니다.");
//
//        }
//
//        return response;
//    }
//
//}
