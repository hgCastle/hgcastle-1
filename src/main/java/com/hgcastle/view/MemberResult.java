package com.hgcastle.view;

public class MemberResult {

    public void printErrorMessage(String errorCode, String object) {

        switch (errorCode) {

            case "youAreWrong" :
                System.err.println("잘못 입력하셨습니다!");
                System.out.println();
                break;
        }
    }
}
