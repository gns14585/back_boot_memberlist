package com.example.back_boot_memberlist.domain;

import lombok.Data;

@Data
public class Member {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Boolean gender;
    private Integer birthday;
}
