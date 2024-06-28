package com.hgcastle.view;

import com.hgcastle.dto.MemberDTO;

public class ExitResult {

    public void printMemberId(MemberDTO id){
        System.out.println(id);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "exitMemberFail" : errorMessage = "해당 ID를 가진 회원이 없습니다.";
                break;
        }

        System.out.println(errorMessage);
    }

}
