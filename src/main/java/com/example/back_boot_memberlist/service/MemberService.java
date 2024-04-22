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

    public void add(Member member) {
        memberMapper.add(member);
    }

    public List<Member> list() {
        return memberMapper.list();

    }
}
