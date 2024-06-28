package com.hgcastle.view;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public class MemberResult {

    public void printMenuDtoList(List<MemberDTO> memberList) {
        System.out.println();
        System.out.println("███████████████████████████ 회원 목록 ████████████████████████████");
        for (MemberDTO member : memberList) {
            System.out.println(member);
        }
    }

    public void printMemberDto(MemberDTO member) {
        System.out.println();
        System.out.println(member);
    }

    public void printSuccessMessage(String successCode) {
        switch (successCode) {
            case "insert":
                System.out.println("");
                System.out.println("█████████████████████ 신규 회원 등록이 완료되었습니다 █████████████████████");
                System.out.println("");
                break;
        }
    }

    public void printErrorMessage(String errorCode) {

        switch (errorCode) {

            case "fail":
                System.err.println("""
                        !!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        !!! 작업 수행을 실패했습니다 !!!
                        !!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        """);
                System.out.println();
                break;

            case "none" :
                System.err.print("존재하지 않는 정보입니다!");
                System.out.println();
                break;

            case "duplicate":
                System.err.print("이미 사용중입니다!");
                System.out.println();
                break;

            case "essential":
                System.err.print("[필수항목] 입니다!");
                System.out.println();
                break;

            case "youAreWrong":
                System.err.println("잘못 입력하셨습니다!");
                System.out.println();
                break;

            case "wrongFormat":
                System.err.print("사용할 수 없는 문자가 포함되어있습니다!");
                System.out.println();
                break;

            case "wrongLength":
                System.err.print("길이가 올바르지 않습니다!");
                System.out.println();
                break;

            case "nonExistentDate":
                System.err.print("생년월이 잘못되었습니다!");
                System.out.println();
                break;

            case "only1234":
                System.err.print("'1, 2, 3, 4'외의 숫자로 시작할 수 없습니다!");
                System.out.println();
                break;
        }
    }
}
