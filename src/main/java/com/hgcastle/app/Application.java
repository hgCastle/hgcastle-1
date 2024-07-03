package com.hgcastle.app;

import com.hgcastle.controller.MemberController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberController con = new MemberController();

        System.out.println("""
                ██╗  ██╗ ██████╗  ██████╗ █████╗ ███████╗████████╗██╗     ███████╗
                ██║  ██║██╔════╝ ██╔════╝██╔══██╗██╔════╝╚══██╔══╝██║     ██╔════╝
                ███████║██║  ███╗██║     ███████║███████╗   ██║   ██║     █████╗
                ██╔══██║██║   ██║██║     ██╔══██║╚════██║   ██║   ██║     ██╔══╝
                ██║  ██║╚██████╔╝╚██████╗██║  ██║███████║   ██║   ███████╗███████╗
                ╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝╚══════╝""");
        do {
            System.out.print("""
                                        
                    ████████████████████████ 회원 관리 프로그램 █████████████████████████
                    ██████████████████████ made by 하얀,규섭,성민 ██████████████████████
                    1) 회원 등록
                    2) 회원 조회
                    3) 회원 탈퇴처리
                    4) 회원 제재
                    5) 회원 정보 삭제
                    0) 프로그램 종료
                    사용할 기능 번호를 입력하세요 :\s""");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    con.insertMember(inputNewMember());
                    break;
                case "2":
                    selectSubMenu();
                    break;
                case "3":
                    con.updateWithdrawMember();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.out.println();
                    System.err.println("""
                 ██████╗  ██████╗  ██████╗ ██████╗ ██████╗ ██╗   ██╗███████╗
                ██╔════╝ ██╔═══██╗██╔═══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██╔════╝
                ██║  ███╗██║   ██║██║   ██║██║  ██║██████╔╝ ╚████╔╝ █████╗
                ██║   ██║██║   ██║██║   ██║██║  ██║██╔══██╗  ╚██╔╝  ██╔══╝
                ╚██████╔╝╚██████╔╝╚██████╔╝██████╔╝██████╔╝   ██║   ███████╗
                 ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚═════╝    ╚═╝   ╚══════╝
                █████████████████████ 프로그램을 종료합니다 ████████████████████""");
                    return;
                default:
                    System.out.println();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!!! 잘못 입력하셨습니다 !!!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        } while (true);
    }

    private static Map<String, String> inputNewMember() {

        MemberController con = new MemberController();
        Scanner sc = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();

        System.out.println();
        System.out.println("████████████████████████ 신규 회원을 등록합니다 ████████████████████████");

        // 아이디 입력 메소드
        String id = con.inputID();
        if (id.equals("0")) {
            return null;
        }

        // 비밀번호 입력 메소드
        String password = con.inputPassword();
        if (password.equals("0")) {
            return null;
        }

        // 이름 입력 메소드
        String name = con.inputName();
        if (name.equals("0")) {
            return null;
        }

        // 닉네임 입력 메소드
        String nickname = con.inputNickname();
        if (nickname.equals("0")) {
            return null;
        }

        // 취미 입력 메소드
        String hobby = con.inputHobby();
        if (hobby.equals("0")) {
            return null;
        }

        // 휴대전화번호 입력 메소드
        String phone = con.inputPhone();
        if (phone.equals("0")) {
            return null;
        }

        // 주민등록번호 입력 메소드
        String rrn = con.inputRrn();
        if (rrn == null) {
            return null;
        }

        System.out.println("\n* 돌아가시려면 숫자 '0'을 입력하세요.");
        System.out.print("등록할 회원의 거주지(필수 아님) : ");
        String address = sc.nextLine();
        if (address.equals("0")) {
            return null;
        }


        System.out.println();
        System.out.println("██████████████████████████ 입력하신 정보 ██████████████████████████");
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("닉네임 : " + nickname);
        System.out.println("휴대폰 번호 : " + phone);
        System.out.println("주민등록번호 : " + rrn);
        System.out.println("거주지 : " + (address.isBlank() ? "(입력 안함)" : address));

        if (con.isItRight()) {
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

    private static void selectSubMenu() {

        Scanner sc = new Scanner(System.in);
        MemberController con = new MemberController();

        do {
            System.out.println();
            System.out.println("████████████████████████ 회원 조회 기능목록 █████████████████████████");
            System.out.println("1) 회원 전체 조회");
            System.out.println("2) 아이디로 특정 회원 조회");
            System.out.println("3) 이름으로 특정 회원 조회");
            System.out.println("4) 경고 누적이 있는 회원만 조회");
            System.out.println("5) 탈퇴한 회원만 조회");
            System.out.println("0) 돌아가기");
            System.out.print("사용할 기능 번호를 입력하세요 : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    con.selectAllMember();
                    break;
                case "2":
                    con.selectMemberById(searchById());
                    break;
                case "3":
                    con.selectMemberByName(searchByName());
                    break;
                case "4":
                    con.selectMemberByWarnCount();
                    break;
                case "5":
                    con.selectQuitMember();
                    break;
                case "0":
                    return;
                default:
                    System.out.println();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!!! 잘못 입력하셨습니다 !!!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        } while (true);
    }

    private static String searchById() {
        return new MemberController().searchById();
    }

    private static String searchByName() {
        return new MemberController().searchByName();
    }
}
