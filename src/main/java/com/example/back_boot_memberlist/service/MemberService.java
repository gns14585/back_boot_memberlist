package com.example.back_boot_memberlist.service;

import com.example.back_boot_memberlist.domain.Member;
import com.example.back_boot_memberlist.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public boolean add(Member member) {
        if (memberMapper.add(member) != 1) {
            return false;
        }
        return true;
    }

    public List<Member> list() {
        return memberMapper.list();

    }
}
