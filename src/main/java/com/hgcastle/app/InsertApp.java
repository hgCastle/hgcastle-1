package com.hgcastle.app;

import com.hgcastle.controller.InsertController;

import java.util.*;

public class InsertApp {

    public static void main(String[] args) {
        InsertController insertController = new InsertController();

        do {
            System.out.println("\n============= 회원 등록 기능 어플리케이션 =============");
            insertController.insertMember(inputNewMember());
        } while (true);
    }

    private static Map<String, String> inputNewMember() {
        InsertController insertController = new InsertController();

        Scanner sc = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();

        // 아이디 입력 메소드
        String id = insertController.inputID();

        // 비밀번호 입력 메소드
        String password = insertController.inputPassword();

        // 이름 입력 메소드
        String name = insertController.inputName();

        // 닉네임 입력 메소드
        String nickname = insertController.inputNickname();

        // 취미 입력 메소드
        String hobby = insertController.inputHobby();

        // 휴대전화번호 입력받는 메소드
        String phone = insertController.inputPhone();

        // 주민번호 앞자리 입력 메소드
        String frontRrn = insertController.inputFrontRrn();
        // 주민번호 뒷자리 입력 메소드
        String backRrn = insertController.inputBackRrn();
        String rrn = insertController.inputRrn(frontRrn, backRrn);

        System.out.print("\n등록할 회원의 거주지(필수 아님) : ");
        String address = sc.nextLine();

        System.out.println("");
        System.out.println("====== 입력하신 정보 ======");
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("닉네임 : " + nickname);
        System.out.println("휴대폰 번호 : " + phone);
        System.out.println("주민등록번호 : " + rrn);
        System.out.println("거주지 : " + (address.isBlank() ? "(입력 안함)" : address));

        if (insertController.isItRight()) {
            parameter.put("id", id);
            parameter.put("password", password);
            parameter.put("name", name);
            parameter.put("nickname", nickname);
            parameter.put("hobby", hobby);
            parameter.put("phone", phone);
            parameter.put("rrn", rrn);
            parameter.put("address", address);
            return parameter;
        } else {
            return null;
        }
    }

//    private static String inputID() {
//        Scanner sc = new Scanner(System.in);
//        String obj = "아이디";
//
//        do {
//            System.out.println();
//            System.out.println("!!! 아이디 생성 조건 !!!");
//            System.out.println("1. 공백 포함 불가");
//            System.out.println("2. 영어소문자와 숫자로만 구성");
//            System.out.println("3. 최소 5, 최대 12 글자로 구성");
//            System.out.print("등록할 아이디 : ");
//            String id = sc.nextLine();
//            if (id.isEmpty()) {
//                insertResult.printErrorMessage("empty", obj + '는');
//                System.out.println();
//            } else if (!id.matches("[a-z0-9]*")) {
//                insertResult.printErrorMessage("wrongFormat", null);
//                System.out.println();
//            } else if (id.length() < 5 || id.length() > 12) {
//                insertResult.printErrorMessage("wrongLength", null);
//                System.out.println();
//            } else {
//                return id;
//            }
//        } while (true);
//    }
//
//    private static String inputPassword() {
//        Scanner sc = new Scanner(System.in);
//        String obj = "비밀번호";
//
//        do {
//            System.out.println();
//            System.out.println("!!! 비밀번호 생성 조건 !!!");
//            System.out.println("1. 공백 포함 불가");
//            System.out.println("2. 최소 5, 최대 20 글자로 구성");
//            System.out.println("3. 사용가능한 특수문자 : ~!@#$%^&*_-+=`|\\:;\"',.?/");
//            System.out.println("4. 사용가능한 특수문자와 영문자, 숫자로만 구성");
//            System.out.print("등록할 비밀번호 : ");
//            String password = sc.nextLine();
//            if (password.isEmpty()) {
//                insertResult.printErrorMessage("empty", obj + '는');
//                System.out.println();
//            } else if (!password.matches("[-~!@#$%^&*_+=`|:;\\\"',.?/a-zA-Z0-9]*")) {
//                insertResult.printErrorMessage("wrongFormat", null);
//                System.out.println();
//            } else if (password.length() < 5 || password.length() > 20) {
//                insertResult.printErrorMessage("wrongLength", null);
//                System.out.println();
//            } else {
//                return password;
//            }
//        } while (true);
//    }
//
//    private static String inputNickname() {
//        Scanner sc = new Scanner(System.in);
//        String obj = "별명";
//
//        do {
//            System.out.println();
//            System.out.println("!!! 별명 생성 조건 !!!");
//            System.out.println("1. 공백 포함 불가");
//            System.out.println("2. 한글과 영문자, 숫자로만 구성");
//            System.out.println("3. 최소 1, 최대 6 글자로 구성");
//            System.out.print("등록할 별명 : ");
//            String nickname = sc.nextLine();
//            if (nickname.isEmpty()) {
//                insertResult.printErrorMessage("empty", obj + '은');
//                System.out.println();
//            } else if (!nickname.matches("[a-zA-z0-9가-힣]*")) {
//                return nickname;
//            } else if (nickname.length() > 6) {
//                insertResult.printErrorMessage("wrongLength", null);
//                System.out.println();
//            } else {
//                return nickname;
//            }
//        } while (true);
//    }
//
//    private static String inputPhone() {
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println();
//            System.out.print("등록할 회원의 휴대폰 번호 8자리('-'없이 '010' 이후 8자리만 작성) : 010");
//            String phone = sc.nextLine();
//            if (phone.isEmpty()) {
//                insertResult.printErrorMessage("empty", "휴대폰 번호는");
//                System.out.println();
//            } else if (!phone.matches("[0-9]*")) {
//                insertResult.printErrorMessage("wrongFormat", null);
//                System.out.println();
//            } else if (phone.length() != 8) {
//                insertResult.printErrorMessage("wrongLength", null);
//                System.out.println();
//            } else {
//                return phone;
//            }
//        } while (true);
//    }
//
//    private static String inputFrontRrn() {
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println();
//            System.out.print("등록할 회원의 주민등록번호 앞 6자리 : ");
//            String frontRrn = sc.nextLine();
//            if (frontRrn.isEmpty()) {
//                insertResult.printErrorMessage("empty", "주민등록번호는");
//                System.out.println();
//            } else if (!frontRrn.matches("[0-9]*")) {
//                insertResult.printErrorMessage("wrongFormat", null);
//                System.out.println();
//            } else if (1 > Integer.parseInt(frontRrn.substring(2, 4)) || Integer.parseInt(frontRrn.substring(2, 4)) > 12
//                    || 1 > Integer.parseInt(frontRrn.substring(4)) || Integer.parseInt(frontRrn.substring(4)) > 31) {
//                insertResult.printErrorMessage("nonExistentDate", null);
//                System.out.println();
//            } else if (frontRrn.length() != 6) {
//                insertResult.printErrorMessage("wrongLength", null);
//                System.out.println();
//            } else {
//                return frontRrn;
//            }
//        } while (true);
//    }
//
//    private static String inputBackRrn() {
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println();
//            System.out.print("등록할 회원의 주민등록번호 뒤 7자리 : ");
//            String backRrn = sc.nextLine();
//            if (backRrn.isEmpty()) {
//                insertResult.printErrorMessage("empty", "주민등록번호는");
//                System.out.println();
//            } else if (!backRrn.matches("^[0-9]*")) {
//                insertResult.printErrorMessage("wrongFormat", null);
//                System.out.println();
//            } else if (backRrn.charAt(0) != '1' && backRrn.charAt(0) != '2'
//                    && backRrn.charAt(0) != '3' && backRrn.charAt(0) != '4') {
//                insertResult.printErrorMessage("backRrnStartWithout1to4", null);
//                System.out.println();
//            } else if (backRrn.length() != 7) {
//                insertResult.printErrorMessage("wrongLength", null);
//                System.out.println();
//            } else {
//                return backRrn;
//            }
//        } while (true);
//    }
//
//    private static boolean isitRight() {
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println("이대로 등록을 진행하시겠습니까?");
//            System.out.print("1.예(Y)      2.아니오(N) : ");
//            String yesOrNo = sc.nextLine();
//            if (yesOrNo.equals("예") || yesOrNo.equals("Y") || yesOrNo.equals("y") || yesOrNo.equals("1")
//                    || yesOrNo.equals("네") || yesOrNo.equals("ㅇ") || yesOrNo.equals("ㅇㅇ") || yesOrNo.equals("ㄱㄱ")
//                    || yesOrNo.equals("ㄱ") || yesOrNo.equals("응") || yesOrNo.equals("어") || yesOrNo.equals("웅")) {
//                return true;
//            } else if (yesOrNo.equals("아니오") || yesOrNo.equals("N") || yesOrNo.equals("n") || yesOrNo.equals("2")
//                    || yesOrNo.equals("아니요") || yesOrNo.equals("ㄴ") || yesOrNo.equals("ㄴㄴ") || yesOrNo.equals("놉")
//                    || yesOrNo.equals("노") || yesOrNo.equals("시러")) {
//                return false;
//            } else {
//                insertResult.printErrorMessage("youAreWrong", null);
//                System.out.println();
//            }
//        } while (true);
//    }
}
