package com.hgcastle.app;

import com.hgcastle.controller.DeleteController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DeleteController deleteController = new DeleteController();

        do {
            System.out.println("============회원 탈퇴 시스템==============");
            System.out.println("1. 아이디로 탈퇴할 회원 조회하기 ");
            System.out.println("메뉴 관리 번호를 입력해주세요 : ");
            String id = sc.nextLine();

            switch (id){
                case "1": deleteController.deleteMember(inputMemberId()); break;
            }
        } while (true);
    }

    private static Map<String, String> inputMemberId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 아이디를 입력해주세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id",id);

        return parameter;
    }

}
