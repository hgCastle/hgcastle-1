package com.hgcastle.view;

public class LoginResult {

    public void printSuccessMessage(String successCode) {
        switch (successCode) {
            case "login" :
                System.out.println("===================");
                System.out.println("로그인을 성공하였습니다");
                System.out.println("===================");
                System.out.println();
                break;
        }
    }

    public void printErrorMessage(String errorCode) {
        switch (errorCode) {
            case "noneExistId":
                System.err.print("존재하지 않는 아이디입니다!");
                System.out.println();
                break;
            case "blank":
                System.err.print("아무것도 입력하지 않으셨습니다!");
                System.out.println();
                break;
            case "wrongPassword" :
                System.err.print("비밀번호가 틀렸습니다!");
                System.out.println();
                break;
        }
    }
}
