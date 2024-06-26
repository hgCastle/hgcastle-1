package com.hgcastle.app;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.InsertService;

import java.time.LocalDate;
import java.util.Scanner;

public class InsertApp {

    public static void main(String[] args) {
        InsertService insertService = new InsertService();

        System.out.println("============= 회원 등록 기능 어플리케이션 =============");
        do {
            insertService.insertMember(inputNewMember());
        } while (true);
    }

    private static MemberDTO inputNewMember() {
        Scanner sc = new Scanner(System.in);
        MemberDTO newMember = new MemberDTO();

        // 아이디 입력 메소드
        String id = inputID();
        String email = id + "@naver.com";

        // 비밀번호 입력 메소드
        String password = inputPassword();

        System.out.print("\n등록할 회원의 본명 : ");
        String name = sc.nextLine();

        // 닉네임 입력 메소드
        String nickname = inputNickname();

        System.out.print("\n등록할 회원의 취미 : ");
        String hobby = sc.nextLine();

        // 휴대전화번호 입력받는 메소드
        String phone = inputPhone();

        // 주민번호 앞자리 입력 메소드
        String frontRRN = inputFrontRRN();
        // 주민번호 뒷자리 입력 메소드
        String backRRN = inputBackRRN();
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
            System.out.println("!!! 아이디 생성 조건 !!!");
            System.out.println("1. 공백 포함 불가");
            System.out.println("2. 영어소문자와 숫자로만 구성");
            System.out.println("3. 최소 5, 최대 12 글자로 구성");
            System.out.print("등록할 아이디 : ");
            String id = sc.nextLine();
            if (id.isEmpty()) {
                System.err.print("아이디는 [필수항목]입니다!");
                System.out.println();
            } else if (id.length() < 5) {
                System.err.print("아이디의 길이가 너무 짧습니다!");
                System.out.println();
            } else if (id.length() > 12) {
                System.err.print("아이디의 길이가 너무 깁니다!");
                System.out.println();
            } else if (id.matches("[a-z0-9]{5,12}")) {
                return id;
            } else {
                System.err.print("조건에 맞게 입력해주세요!");
                System.out.println();
            }
        } while (true);
    }

    private static String inputPassword() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("!!! 비밀번호 생성 조건 !!!");
            System.out.println("1. 공백 포함 불가");
            System.out.println("2. 최소 5, 최대 20 글자로 구성");
            System.out.println("3. 사용가능한 특수문자 : ~!@#$%^&*_-+=`|\\:;\"',.?/");
            System.out.println("4. 사용가능한 특수문자와 영문자, 숫자로만 구성");
            System.out.print("등록할 비밀번호 : ");
            String password = sc.nextLine();
            if (password.isEmpty()) {
                System.err.print("비밀번호는 [필수항목]입니다!");
                System.out.println();
            } else if (password.length() < 5) {
                System.err.print("비밀번호의 길이가 너무 짧습니다!");
                System.out.println();
            } else if (password.length() > 20) {
                System.err.print("비밀번호의 길이가 너무 깁니다!");
                System.out.println();
            } else if (password.matches("[-~!@#$%^&*_+=`|:;\\\"',.?/a-zA-Z0-9]{5,20}")) {
                return password;
            } else {
                System.err.print("조건에 맞게 입력해주세요!");
                System.out.println();
            }
        } while (true);
    }

    private static String inputNickname() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("!!! 별명 생성 조건 !!!");
            System.out.println("1. 공백 포함 불가");
            System.out.println("2. 한글과 영문자, 숫자로만 구성");
            System.out.println("3. 최소 1, 최대 6 글자로 구성");
            System.out.print("등록할 별명 : ");
            String nickname = sc.nextLine();
            if (nickname.isEmpty()) {
                System.err.print("별명은 [필수항목]입니다!");
                System.out.println();
            } else if (nickname.length() > 6) {
                System.err.print("별명의 길이가 너무 깁니다!");
                System.out.println();
            } else if (nickname.matches("[a-zA-z0-9가-힣]{1,6}")) {
                return nickname;
            } else {
                System.err.print("조건에 맞게 입력해주세요!");
                System.out.println();
            }
        } while (true);
    }

    private static String inputPhone() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 휴대폰 번호 ('-'없이 작성) : ");
            String phone = sc.nextLine();
            if (phone.isEmpty()) {
                System.err.print("휴대폰 번호는 [필수항목]입니다!");
                System.out.println();
            } else if (phone.charAt(0) != '0') {
                System.err.print("'0'이 아닌 숫자로 시작할 수 없습니다!");
                System.out.println();
            } else if (phone.length() != 11) {
                System.err.print("11자리 숫자로 입력해주세요!");
                System.out.println();
            } else if (phone.matches("[0-9]{11}")) {
                return phone;
            } else {
                System.err.print("잘못 입력하셨습니다!");
                System.out.println();
            }
        } while (true);
    }

    private static String inputFrontRRN() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 주민등록번호 앞 6자리 : ");
            String frontRRN = sc.nextLine();
            if (frontRRN.isEmpty()) {
                System.err.print("주민등록번호는 [필수항목]입니다!");
                System.out.println();
            } else if (1 > Integer.parseInt(frontRRN.substring(2, 4)) || Integer.parseInt(frontRRN.substring(2, 4)) > 12
                    || 1 > Integer.parseInt(frontRRN.substring(4)) || Integer.parseInt(frontRRN.substring(4)) > 31) {
                System.err.print("생년월일을 잘못 입력하셨습니다!");
                System.out.println();
            } else if (frontRRN.length() != 6) {
                System.err.print("6자리 숫자로 입력해주세요!");
                System.out.println();
            } else if (frontRRN.matches("[0-9]{6}")) {
                return frontRRN;
            } else {
                System.err.print("잘못 입력하셨습니다!");
                System.out.println();
            }
        } while (true);
    }

    private static String inputBackRRN() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 주민등록번호 뒤 7자리 : ");
            String backRRN = sc.nextLine();
            if (backRRN.isEmpty()) {
                System.err.print("주민등록번호는 [필수항목]입니다.");
                System.out.println();
            } else if (backRRN.charAt(0) != '1' && backRRN.charAt(0) != '2'
                    && backRRN.charAt(0) != '3' && backRRN.charAt(0) != '4') {
                System.err.print("'1, 2, 3, 4'외의 숫자로 시작할 수 없습니다!");
                System.out.println();
            } else if (backRRN.length() != 7) {
                System.err.print("7자리 숫자로 입력해주세요!");
                System.out.println();
            } else if (backRRN.matches("[0-9]{7}")) {
                return backRRN;
            } else {
                System.err.print("잘못 입력하셨습니다!");
                System.out.println();
            }
        } while (true);
    }
}
