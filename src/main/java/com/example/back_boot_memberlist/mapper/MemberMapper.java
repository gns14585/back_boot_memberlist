package com.example.back_boot_memberlist.mapper;

import com.example.back_boot_memberlist.domain.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Insert("""
            INSERT INTO memberlist (id, name, email, phone, birthday, gender) 
            VALUES (
            #{id},
            #{name},
            #{email},
            #{phone},
            #{birthday},
            #{gender}
            )
            """)
    int add(Member member);

    @Select("""
            SELECT *
            FROM memberlist
            """)
    List<Member> list();
}
