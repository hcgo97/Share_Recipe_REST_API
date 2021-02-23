package com.hyoj.share_recipe.repository;

import com.hyoj.share_recipe.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    int countByUserid(String userid);

    Optional<Member> findByEmail(String email);

    Optional<Member> findByUserid(String userid);

}
