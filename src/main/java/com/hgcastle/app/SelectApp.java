package com.hgcastle.app;

import com.hgcastle.service.SelectService;

import java.util.Scanner;


public class SelectApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SelectService selectService = new SelectService();

        do {

                System.out.println("=========== 취미 공유 카페 회원 관리 프로그램 ===========");
                System.out.println("1. 회원 등록");
                System.out.println("2. 회원 탈퇴");
                System.out.println("3. 회원 삭제");
                System.out.println("4. 회원 조회");
                System.out.println("5. 회원 정보 수정");
                System.out.println("6. 회원 제재");
                System.out.println("7. 로그인");
                int no = sc.nextInt();

                switch (no) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4: selectMemberSubMenu();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
                }

        } while (true);
    }

    private static void selectMemberSubMenu() {
        Scanner sc = new Scanner(System.in);
        SelectService selectService = new SelectService();
        do {
            System.out.println("=========== 회원 조회 서브 메뉴 ===========");
            System.out.println("1. 회원 전체 조회");
            System.out.println("2. 아이디로 특정 회원 조회");
            System.out.println("3. 이름으로 특정 회원 조회");
            System.out.println("4. 경고 누적이 있는 회원만 조회");
            System.out.println("5. 탈퇴한 회원만 조회");
            System.out.println("6. 돌아가기");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    selectService.viewAllMembers();
                    break;
                case 2:
                    String id = searchMemberId();
                    selectService.viewMembersById(id);
                    break;
                case 3:
                    String name = searchMemberName();
                    selectService.viewMembersByName(name);
                    break;
                case 4:
                    selectService.viewMembersByWarnCount();
                    break;
                case 5:
                    selectService.viewMembersByQuitDate();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");

            }
        } while (true);
    }

    private static String searchMemberId() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 회원의 ID를 입력하세요.");
        String id = sc.nextLine();

        return id;
    }

    private static String searchMemberName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 회원의 이름를 입력하세요.");
        String name = sc.nextLine();

        return name;
    }
}
