package com.example.back_boot_memberlist.mapper;

import com.example.back_boot_memberlist.domain.Member;
import org.apache.ibatis.annotations.*;

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

    @Select("""
            SELECT *
            FROM memberlist
            WHERE id = #{id}
            """)
    Member selectById(Integer id);

    @Delete("""
            DELETE FROM memberlist
            WHERE id = #{id}
            """)
    int del(Integer id);

    @Update("""
            UPDATE memberlist
            SET
                email = #{email},
                phone = #{phone},
                birthday = #{birthday},
                gender = #{gender}
            WHERE id = #{id}
            """)
    int update(Member member);
}
