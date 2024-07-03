package com.hgcastle.view;

import com.hgcastle.dto.MemberDTO;

import java.util.List;

public class MemberResult {

    public void printMenuDtoList(List<MemberDTO> memberList) {
        System.out.println("\n███████████████████████████ 회원 목록 ████████████████████████████");
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
                System.out.println();
                System.out.println("██████████████████████████████████");
                System.out.println("███ 신규 회원 등록이 완료되었습니다 ███");
                System.out.println("██████████████████████████████████");
                break;

            case "withdraw":
                System.out.println();
                System.out.println("█████████████████████████████");
                System.out.println("███ 탈퇴처리가 완료되었습니다 ███");
                System.out.println("█████████████████████████████");
                break;
        }
    }

    public void printErrorMessage(String errorCode) {

        switch (errorCode) {

            case "toBegin":
                System.out.println("");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 첫 화면으로 돌아갑니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "fail":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 작업 수행을 실패했습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "noApply":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 해당하는 회원이 존재하지 않습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "none":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 존재하지 않는 정보입니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "duplicate":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 이미 사용중입니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "essential":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! [필수항목] 입니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "youAreWrong":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 잘못 입력하셨습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "wrongFormat":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 사용할 수 없는 문자가 포함되어있습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "wrongLength":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 길이가 올바르지 않습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "nonExistentDate":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! 생년월이 잘못되었습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;

            case "only1234":
                System.out.println();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!!! '1, 2, 3, 4'외의 숫자로 시작할 수 없습니다 !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
        }
    }
}
