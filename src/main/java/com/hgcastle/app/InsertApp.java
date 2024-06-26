package com.hgcastle.app;


import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.InsertService;

import java.time.LocalDate;
import java.util.Scanner;

public class InsertApp {

    public static void main(String[] args) {
        InsertService insertService = new InsertService();

        System.out.println("============= 회원 등록 기능 어플리케이션 =============");
        while (true) {
            insertService.insertMember(inputNewMember());
        }
    }

    private static MemberDTO inputNewMember() {
        Scanner sc = new Scanner(System.in);
        MemberDTO newMember = new MemberDTO();

        System.out.print("등록할 아이디 : ");
        String id = sc.nextLine();
        String email = id + "@naver.com";

        System.out.print("등록할 비밀번호 : ");
        String password = sc.nextLine();

        System.out.print("등록할 회원명 : ");
        String name = sc.nextLine();

        System.out.print("등록할 닉네임 : ");
        String nickname = sc.nextLine();

        System.out.print("등록할 회원의 취미 : ");
        String hobby = sc.nextLine();

        System.out.print("등록할 회원의 전화번호 ('-'없이 작성) : ");
        String phone = inputPhone();

        System.out.print("등록할 회원의 주민등록번호 앞 6자리 : ");
        String frontRRN = sc.nextLine();
        System.out.print("등록할 회원의 주민등록번호 뒤 7자리 : ");
        String backRRN = sc.nextLine();
        String rrn = frontRRN + '-' + backRRN;

        System.out.print("등록할 회원의 거주지(시, 군, 구 단위만 작성) : ");
        String address = sc.nextLine();

        newMember.setId(id);
        newMember.setPassword(password);
        newMember.setName(name);
        newMember.setNickname(nickname);
        newMember.setHobby(hobby);
        newMember.setPhone(phone);
        newMember.setEmail(email);
        newMember.setRrn(rrn);
        newMember.setAddress(address);
        newMember.setEntDate(LocalDate.now());

        return newMember;
    }

    private static String inputPhone() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("등록할 회원의 전화번호 ('-'없이 작성) : ");
            String phone = sc.nextLine();
            if (phone.length() == 11) {
                return phone;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        } while (true);
    }
}
