package com.hgcastle.view;

public class ExitResult {

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "exitMemberSuccess" : successMessage = "회원 탈퇴에 성공했습니다";
                break;
        }
        System.out.println(successMessage);
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
