package com.hgcastle.app;

import com.hgcastle.controller.ExitController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExitApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExitController exitController = new ExitController();

        do {
            System.out.println("============회원 탈퇴 시스템==============");
            System.out.println("1. 아이디로 탈퇴할 회원 조회하기 ");
            System.out.println("메뉴 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : exitController.selectMemberId(inputId());break;
            }
        } while (true);

    }

    private static Map<String, String> inputId() {

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }


    }


