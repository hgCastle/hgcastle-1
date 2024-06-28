package com.hgcastle.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @Override
    public String toString() {
        return "[이름 : " + name + "] [회원번호 : " + no + "] [아이디 : " + id + "] " +
                "] [별명 : " + nickname + "] [취미 : " + hobby + "] " +
                "[휴대폰 번호 : " + phone.substring(0, 3) + '-' + phone.substring(3, 7) + '-' + phone.substring(7) +
                "] [이메일 : " + email + "] [거주지 : " + (address.isBlank() ? "(입력 안함)" : address) +
                "] [가입일 : " + entDate + "] [경고누적 : " + warnCount + "회] " +
                "[제재기간 : " + (banDate == null ? "제재 없음" : banDate + "까지") +
                "] [탈퇴일 : " + (quitDate == null ? "탈퇴 안함" : quitDate) + ']';
    }
}
