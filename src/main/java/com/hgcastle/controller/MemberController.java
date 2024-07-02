package com.hgcastle.controller;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.MemberService;
import com.hgcastle.view.MemberResult;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberController {

    private final MemberResult result;
    private final MemberService service;

    public MemberController() {
        result = new MemberResult();
        service = new MemberService();
    }

    public void insertMember(Map<String, String> parameter) {

        if (parameter != null) {
            String id = parameter.get("id");
            String password = parameter.get("password");
            String name = parameter.get("name");
            String nickname = parameter.get("nickname");
            String hobby = parameter.get("hobby");
            String phone = parameter.get("phone");
            String rrn = parameter.get("rrn");
            String address = parameter.get("address");

            // 입력값을 따로 받지않고 자동으로 설정되는 항목
            String email = id + "@naver.com";
            LocalDate entDate = LocalDate.now();

            MemberDTO newMember = new MemberDTO();
            newMember.setId(id);
            newMember.setPassword(password);
            newMember.setName(name);
            newMember.setNickname(nickname);
            newMember.setHobby(hobby);
            newMember.setPhone(phone);
            newMember.setEmail(email);
            newMember.setRrn(rrn);
            newMember.setAddress(address);
            newMember.setEntDate(entDate);

            if (service.insertMember(newMember)) {
                result.printSuccessMessage("insert");
            } else {
                result.printErrorMessage("fail");
            }
        }
    }

    public String inputID() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("!!! 아이디 생성 조건 !!!");
            System.out.println("1. 공백 포함 불가");
            System.out.println("2. 영어소문자와 숫자로만 구성");
            System.out.println("3. 최소 5, 최대 12 글자로 구성");
            System.out.print("등록할 아이디 : ");
            String id = sc.nextLine();
            if (id.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!id.matches("^[a-z0-9]*$")) {
                result.printErrorMessage("wrongFormat");
            } else if (id.length() < 5 || id.length() > 12) {
                result.printErrorMessage("wrongLength");
            } else {
                if (service.isIdDuplicate(id)) {
                    result.printErrorMessage("duplicate");
                } else {
                    return id;
                }
            }
        } while (true);
    }

    public String inputPassword() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("!!! 비밀번호 생성 조건 !!!");
            System.out.println("1. 공백 포함 불가");
            System.out.println("2. 최소 5, 최대 20 글자로 구성");
            System.out.println("3. 사용가능한 특수문자 : ~ ! @ # $ % ^ & * _ - + = ` | \\ : ; \" ' , . ? /");
            System.out.println("4. 사용가능한 특수문자와 영문자, 숫자로만 구성");
            System.out.print("등록할 비밀번호 : ");
            String password = sc.nextLine();
            if (password.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!password.matches("^[-~!@#$%^&*_+=`|:;\\\"',.?/a-zA-Z0-9]*$")) {
                result.printErrorMessage("wrongFormat");
            } else if (password.length() < 5 || password.length() > 20) {
                result.printErrorMessage("wrongLength");
            } else {
                return password;
            }
        } while (true);
    }

    public String inputName() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 본명 : ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!name.matches("^[가-힣]*$")) {
                result.printErrorMessage("wrongFormat");
            } else {
                return name;
            }
        } while (true);
    }

    public String inputNickname() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("!!! 별명 생성 조건 !!!");
            System.out.println("1. 공백 포함 불가");
            System.out.println("2. 한글과 영문자, 숫자로만 구성");
            System.out.println("3. 최소 1, 최대 6 글자로 구성");
            System.out.print("등록할 별명 : ");
            String nickname = sc.nextLine();
            if (nickname.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!nickname.matches("^[a-zA-Z0-9가-힣]*$")) {
                result.printErrorMessage("wrongFormat");
            } else if (nickname.length() > 6) {
                result.printErrorMessage("wrongLength");
            } else {
                if (service.isNicknameDuplicate(nickname)) {
                    result.printErrorMessage("duplicate");
                } else {
                    return nickname;
                }
            }
        } while (true);
    }

    public String inputHobby() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 취미 (한글로만 작성) : ");
            String hobby = sc.nextLine();
            if (hobby.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!hobby.matches("^[가-힣]*$")) {
                result.printErrorMessage("wrongFormat");
            } else {
                return hobby;
            }
        } while (true);
    }

    public String inputPhone() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 휴대폰 번호 8자리('-'없이 '010' 이후 8자리만 작성) : 010");
            String phone = sc.nextLine();
            if (phone.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!phone.matches("^[0-9]*$")) {
                result.printErrorMessage("wrongFormat");
            } else if (phone.length() != 8) {
                result.printErrorMessage("wrongLength");
            } else {
                if (service.isPhoneDuplicate("010" + phone)) {
                    result.printErrorMessage("duplicate");
                } else {
                    return phone;
                }
            }
        } while (true);
    }

    public String inputFrontRrn() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 주민등록번호 앞 6자리 : ");
            String frontRrn = sc.nextLine();
            if (frontRrn.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!frontRrn.matches("^[0-9]*$")) {
                result.printErrorMessage("wrongFormat");
            } else if (1 > Integer.parseInt(frontRrn.substring(2, 4)) || Integer.parseInt(frontRrn.substring(2, 4)) > 12
                    || 1 > Integer.parseInt(frontRrn.substring(4)) || Integer.parseInt(frontRrn.substring(4)) > 31) {
                result.printErrorMessage("nonExistentDate");
            } else if (frontRrn.length() != 6) {
                result.printErrorMessage("wrongLength");
            } else {
                return frontRrn;
            }
        } while (true);
    }

    public String inputBackRrn() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("등록할 회원의 주민등록번호 뒤 7자리 : ");
            String backRrn = sc.nextLine();
            if (backRrn.isBlank()) {
                result.printErrorMessage("essential");
            } else if (!backRrn.matches("^[0-9]*$")) {
                result.printErrorMessage("wrongFormat");
            } else if (backRrn.charAt(0) != '1' && backRrn.charAt(0) != '2'
                    && backRrn.charAt(0) != '3' && backRrn.charAt(0) != '4') {
                result.printErrorMessage("only1234");
            } else if (backRrn.length() != 7) {
                result.printErrorMessage("wrongLength");
            } else {
                return backRrn;
            }
        } while (true);
    }

    public String inputRrn() {

        do {
            String frontRrn = inputFrontRrn();
            String backRrn = inputBackRrn();
            String rrn = frontRrn + '-' + backRrn;
            if (service.isRrnDuplicate(rrn)) {
                result.printErrorMessage("duplicate");
            } else {
                return rrn;
            }
        } while (true);
    }

    public boolean isItRight() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("████████████ 이대로 등록을 진행하시겠습니까? ████████████");
            System.out.print("                1.예(Y)      2.아니오(N) : ");
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
                result.printErrorMessage("youAreWrong");
            }
        } while (true);
    }

    public void selectAllMember() {

        List<MemberDTO> memberList = service.selectAllMember();

        if (memberList != null) {
            result.printMenuDtoList(memberList);
        } else {
            result.printErrorMessage("noApply");
        }
    }

    public void selectMemberByWarnCount() {

        List<MemberDTO> warnedMemberList = service.selectMemberByWarnCount();

        if (warnedMemberList.isEmpty()) {
            result.printErrorMessage("noApply");
        } else {
            result.printMenuDtoList(warnedMemberList);
        }
    }

    public void selectQuitMember() {

        List<MemberDTO> quitMemberList = service.selectQuitMember();

        if (quitMemberList.isEmpty()) {
            result.printErrorMessage("noApply");
        } else {
            result.printMenuDtoList(quitMemberList);
        }
    }

    public String searchById() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("검색할 아이디를 입력하세요 : ");
            String id = sc.nextLine();
            if (id.isBlank()) {
                result.printErrorMessage("essential");
            } else {
                if (service.isIdDuplicate(id)) {
                    return id;
                } else {
                    result.printErrorMessage("none");
                }
            }
        } while (true);
    }

    public void selectMemberById(String id) {

        MemberDTO member = service.selectMemberById(id);

        if (member != null) {
            result.printMemberDto(member);
        } else {
            result.printErrorMessage("none");
        }
    }

    public String searchByName() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("검색할 이름을 입력하세요 : ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                result.printErrorMessage("essential");
            } else {
                if (service.isNameDuplicate(name)) {
                    return name;
                } else {
                    result.printErrorMessage("none");
                }
            }
        } while (true);
    }

    public void selectMemberByName(String name) {

        MemberDTO member = service.selectMemberByName(name);

        if (member != null) {
            result.printMemberDto(member);
        } else {
            result.printErrorMessage("none");
        }
    }

    public void updateWithdrawMember() {

        Date quitDate = new java.sql.Date(new java.util.Date().getTime());

        do {
            System.out.println();
            System.out.println("████████████████████████ 회원 탈퇴 처리하기 █████████████████████████");
            String id = searchById();
            selectMemberById(id);
            if (isItWithdrawMember(id)) {
                if (service.updateWithdrawMember(id, quitDate)) {
                    result.printSuccessMessage("withdraw");
                } else {
                    result.printErrorMessage("fail");
                }
            } else {
                return;
            }
        } while (true);
    }

    private boolean isItWithdrawMember(String id) {
        Scanner sc = new Scanner(System.in);
        do {
            service.selectMemberById(id);
            System.out.println("\n██████████ 위 회원의 탈퇴를 진행하시겠습니까? ██████████");
            System.out.print("              1.예(Y)      2.아니오(N) : ");
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
                result.printErrorMessage("youAreWrong");
            }
        } while (true);
    }
}
