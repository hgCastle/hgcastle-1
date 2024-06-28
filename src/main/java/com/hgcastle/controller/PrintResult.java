package com.hgcastle.controller;

import com.hgcastle.dto.MemberDTO;

public class PrintResult {

    public void printMember(MemberDTO member) {

        System.out.println(member);
    }

    public void printSuccessMessage(String delete) {

        String successMessage = "";
        switch (delete){
            case "delete" : successMessage = "회원 삭제를 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String erroCode) {

        String errorMessage = "";
        switch (erroCode){
            case "delete" : errorMessage = "회원 삭제를 성공했습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
