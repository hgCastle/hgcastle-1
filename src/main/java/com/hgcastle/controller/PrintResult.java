package com.hgcastle.controller;

import com.hgcastle.dto.MemberDTO;

public class PrintResult {

    public void printMember(MemberDTO member) {

        System.out.println(member);
    }

    public void printErrorMessage(String erroCode) {
        String errorMessage = "";
        switch (erroCode){
            case "selectOne" : errorMessage = "회원 조회를 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
