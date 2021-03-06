package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.test.entity.Member;

@Mapper
public interface BoardMapper {
	@Select("select userid, username, age from tbl_test order by userid") //order by userid : 알파벳 순으로 정리
	public List<Member> selectMemberList();
	
	@Insert("insert into tbl_test (userid, username, age) values (\'${userid}\', \'${username}\', \'${age}\')") //mariadb 상의 쿼리, sql 문에서 문자 넣을 시 작은 따옴표 필요
	public void insertMember(@Param("userid") String userid,
			@Param("username") String username, @Param("age") int age);
}
