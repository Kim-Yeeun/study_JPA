package com.yev.web.member.repository;

import java.util.List;

import com.yev.web.member.vo.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberVo, Long> {

	public List<MemberVo> findById(String id);
	
	public List<MemberVo> findByName(String name);
	
	public List<MemberVo> findByNameLike(String keyword);
}
