package com.hgcastle.view;

import com.hgcastle.dto.MemberDTO;

public class SelectResult {

    public void printMember(MemberDTO member) {

        System.out.println(member);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "viewIdFail" : errorMessage = "해당 ID를 가진 회원이 없습니다."; break;
            case "viewNameFail" : errorMessage = "해당 이름을 가진 회원이 없습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
