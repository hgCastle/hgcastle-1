package com.hgcastle.view;

public class InsertResult {

    public void printSuccessMessage(String successCode) {
        switch (successCode) {
            case "insert":
                System.out.println("===========================");
                System.out.println("신규 회원 등록이 완료되었습니다.");
                System.out.println("===========================");
                break;
        }
    }

    public void printErrorMessage(String errorCode, String errorObj) {
        switch (errorCode) {
            case "unknownError" :
                System.err.print("알수없는 에러가 발생했습니다. 다시 시도해주세요!");
                System.out.println();
            case "insert":
                System.err.println("""
                        !!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        !!! 회원 등록을 실패했습니다 !!!
                        !!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        """);
                break;
            case "empty":
                System.err.print(errorObj + " [필수항목] 입니다!");
                System.out.println();
                break;
            case "wrongLength" :
                System.err.print("길이가 올바르지 않습니다!");
                System.out.println();
                break;
            case "wrongFormat":
                System.err.print("사용할 수 없는 문자가 포함되어있습니다!");
                System.out.println();
                break;
            case "youAreWrong":
                System.err.println("잘못 입력하셨습니다!");
                System.out.println();
                break;
            case "nonExistentDate":
                System.err.print("생년월일을 잘못 입력하셨습니다!");
                System.out.println();
                break;
            case "backRrnStartWithout1to4":
                System.err.print("'1, 2, 3, 4'외의 숫자로 시작할 수 없습니다!");
                System.out.println();
                break;
            case "duplicate" :
                System.err.print("이미 사용중인 " + errorObj + "입니다.");
                System.out.println();
        }
    }
}
