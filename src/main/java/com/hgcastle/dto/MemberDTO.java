package com.hgcastle.dto;

import lombok.*;

import java.lang.reflect.Member;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
    private String id;
    private String password;
    private int no;
    private String name;
    private String nickname;
    private String hobby;
    private String phone;
    private String email;
    private String rrn;
    private String address;
    private LocalDate entDate;
    private int warnCount;
    private LocalDate banDate;
    private LocalDate quitDate;
}
