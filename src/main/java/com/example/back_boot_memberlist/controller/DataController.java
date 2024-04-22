package com.example.back_boot_memberlist.controller;

import com.example.back_boot_memberlist.domain.Member;
import com.example.back_boot_memberlist.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class DataController {

    private final MemberService memberService;

    // ---------------- 회원 생성 ---------------
    @PostMapping("add")
    public ResponseEntity<Member> home(@RequestBody Member member) {
        System.out.println("member = " + member);
        if (memberService.add(member)) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }

    // ---------------- 회원 목록 불러오기 --------------
    @GetMapping("list")
    public List<Member> list() {
        return memberService.list();
    }

    // ---------------- 회원 상세 보기 --------------

    @GetMapping("{id}")
    public Member get(@PathVariable Integer id) {
        return memberService.get(id);
    }

}
