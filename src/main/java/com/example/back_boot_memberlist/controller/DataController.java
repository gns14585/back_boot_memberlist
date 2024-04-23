package com.example.back_boot_memberlist.controller;

import com.example.back_boot_memberlist.domain.Member;
import com.example.back_boot_memberlist.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class DataController {

    private final MemberService memberService;

    // ---------------- 회원 생성 ----------------
    @PostMapping("add")
    public ResponseEntity<Member> home(@RequestBody Member member) {
        if (memberService.add(member)) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }

    // ---------------- 회원 목록 불러오기 ----------------
    @GetMapping("list")
    public List<Member> list() {
        return memberService.list();
    }

    // ---------------- 회원 상세 보기 ----------------
    @GetMapping("{id}")
    public Member get(@PathVariable Integer id) {
        return memberService.get(id);
    }

    // ---------------- 회원 수정 ----------------


    // ---------------- 회원 삭제 ----------------
    @DeleteMapping("delete/{id}")
    public ResponseEntity del(@PathVariable Integer id) {
        if (id == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        if (memberService.delete(id)) {
            return ResponseEntity.ok().build();
        }
    return ResponseEntity.internalServerError().build();
    }

}
