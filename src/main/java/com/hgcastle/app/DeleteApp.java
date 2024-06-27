package com.hgcastle.app;

import com.hgcastle.controller.DeleteController;
import com.hgcastle.service.DeleteService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DeleteController deleteController = new DeleteController();

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
                case 2: deleteMemberSubMenu();
                    break;
                case 3:
                    break;
                case 4:
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

    private static void deleteMemberSubMenu() {

        Scanner sc = new Scanner(System.in);

        DeleteController deleteController = new DeleteController();
        DeleteService deleteService = new DeleteService();
        do {
            System.out.println("============== 회원 탈퇴 서브 메뉴 =============");
            System.out.println("1. 아이디를 입력해 회원 탈퇴시키기");
            System.out.println("2. 돌아가기");
            int no = sc.nextInt();

            switch (no) {
                case 1: deleteController.deleteMembersById(modifyMemberExit());
                break;

                case 2: return;

                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
                    break;
            }



        } while (true);

    }

    private static Map<String, String> modifyMemberExit() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 회원의 ID를 입력하세요.");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }


}
