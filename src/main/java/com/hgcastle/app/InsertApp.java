package com.hgcastle.app;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.InsertService;

import java.sql.SQLOutput;
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

        // 아이디 입력 메소드
        String id = inputID();
        String email = id + "@naver.com";

        // 비밀번호 입력 메소드
        String password = inputPassword();

        System.out.print("등록할 회원명 : ");
        String name = sc.nextLine();

        System.out.print("등록할 닉네임 : ");
        String nickname = sc.nextLine();

        System.out.print("등록할 회원의 취미 : ");
        String hobby = sc.nextLine();

        // 휴대전화번호 입력받는 메소드
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

    private static String inputID() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("***** 아이디 생성 조건 *****");
            System.out.println("1. 영어 소문자와 숫자로만 구성");
            System.out.println("2. 최소 5, 최대 12 글자");
            System.out.print("등록할 아이디 : ");
            String id = sc.nextLine();
            if (id.isEmpty()) {
                System.out.println("아이디는 [필수항목]입니다.");
            } else if (id.matches("[a-z0-9]{5,12}")) {
                return id;
            } else {
                System.err.print("조건에 맞게 입력해주세요!\n");
            }
        } while (true);
    }

    private static String inputPassword() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 비밀번호 : ");
            String password = sc.nextLine();
            if (password.matches("^[a-zA-Z0-9]{8,20}$")) {
                return password;
            } else if (password.matches("^[a-z0-9]$")) {
                System.out.println("비밀번호는 최소 8자, 최대 20자 까지 가능합니다.");
            } else {
                System.out.println("비밀번호는 영어 소문자와 숫자만 사용 가능합니다.");
            }
        } while (true);
    }

    private static String inputPhone() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("등록할 회원의 전화번호 ('-'없이 작성) : ");
            String phone = sc.nextLine();
            if (phone.matches("^[0-9]^{11}$")) {
                return phone;
            } else if (phone.matches("^{11}")) {
                System.out.println("숫자 외에는 입력할 수 없습니다.");
            } else if (phone.charAt(0) != '0') {
                System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);
    }
}
