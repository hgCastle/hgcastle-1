package com.hgcastle.view;

public class DeleteResult {


    public void printSuccessMessage(String successCode){
        String successMessage = "";
        switch (successCode){
            case "delete" : successMessage = "회원 정보 삭제를 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode){
        String errorMessage = "";
        switch (errorCode){
            case "delete" : errorMessage = "회원 정보 삭제에 실패했습니다";break;
        }

        System.out.println(errorMessage);
    }
}
