package com.hgcastle.app;

import com.hgcastle.controller.MemberController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberController controller = new MemberController();

        System.out.println("""
                ██╗  ██╗ ██████╗  ██████╗ █████╗ ███████╗████████╗██╗     ███████╗
                ██║  ██║██╔════╝ ██╔════╝██╔══██╗██╔════╝╚══██╔══╝██║     ██╔════╝
                ███████║██║  ███╗██║     ███████║███████╗   ██║   ██║     █████╗
                ██╔══██║██║   ██║██║     ██╔══██║╚════██║   ██║   ██║     ██╔══╝
                ██║  ██║╚██████╔╝╚██████╗██║  ██║███████║   ██║   ███████╗███████╗
                ╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝╚══════╝
                ████████████████████████ 회원 관리 프로그램 █████████████████████████""");
        do {
            System.out.print("""
                    1) 회원 등록
                    2) 회원 조회
                    3) 회원 탈퇴처리
                    4) 회원 제재
                    5) 회원 정보 삭제
                    0) 프로그램 종료
                    사용할 기능 번호를 입력하세요 : """);
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    controller.insertMember();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    return;
            }
        } while (true);
    }
}
