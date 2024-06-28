package com.hgcastle.controller;

import com.hgcastle.service.MemberService;
import com.hgcastle.view.MemberResult;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberController {

    private final MemberResult result;
    private final MemberService service;

    public MemberController() {
        result = new MemberResult();
        service = new MemberService();
    }

    public void insertMember() {
        Scanner sc = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();

        // 아이디 입력 메소드
        String id = inputID();

        // 비밀번호 입력 메소드
        String password = inputPassword();

        // 이름 입력 메소드
        String name = inputName();

        // 닉네임 입력 메소드
        String nickname = inputNickname();

        // 취미 입력 메소드
        String hobby = inputHobby();

        // 휴대전화번호 입력받는 메소드
        String phone = inputPhone();

        // 주민번호 앞자리 입력 메소드
        String frontRrn = inputFrontRrn();
        // 주민번호 뒷자리 입력 메소드
        String backRrn = inputBackRrn();
        String rrn = inputRrn(frontRrn, backRrn);

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

        if (isItRight()) {
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

    private String inputRrn(String frontRrn, String backRrn) {
        String rrn = frontRrn + '-' + backRrn;
        String obj = "주민등록번호";

        do {
            if (service.isRrnDuplicate(rrn)) {
                result.printErrorMessage("duplicate", obj);
                System.out.println();
            } else {
                return rrn;
            }
        } while (true);
    }

    private boolean isItRight() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("이대로 등록을 진행하시겠습니까?");
            System.out.print("1.예(Y)      2.아니오(N) : ");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("예") || yesOrNo.equals("Y") || yesOrNo.equals("y") || yesOrNo.equals("1")
                    || yesOrNo.equals("네") || yesOrNo.equals("ㅇ") || yesOrNo.equals("ㅇㅇ") || yesOrNo.equals("ㄱㄱ")
                    || yesOrNo.equals("ㄱ") || yesOrNo.equals("응") || yesOrNo.equals("어") || yesOrNo.equals("웅")) {
                return true;
            } else if (yesOrNo.equals("아니오") || yesOrNo.equals("N") || yesOrNo.equals("n") || yesOrNo.equals("2")
                    || yesOrNo.equals("아니요") || yesOrNo.equals("ㄴ") || yesOrNo.equals("ㄴㄴ") || yesOrNo.equals("놉")
                    || yesOrNo.equals("노") || yesOrNo.equals("시러")) {
                return false;
            } else {
                result.printErrorMessage("youAreWrong", null);
                System.out.println();
            }
        } while (true);
    }
}
