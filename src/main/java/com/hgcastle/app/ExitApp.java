package com.hgcastle.app;

import com.hgcastle.controller.ExitController;
import com.hgcastle.view.ExitResult;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExitApp {
    private static ExitResult exitResult = new ExitResult();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExitController exitController = new ExitController();


        do {
            System.out.println("============회원 탈퇴 시스템==============");
            exitController.selectMemberId(inputMemberId()); break;

        } while (true);

    }

    private static Map<String, String> inputMemberId() {
        ExitController exitController = new ExitController();

        Scanner sc = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();

        System.out.println("탈퇴할 아이디를 입력하세요 : ");
        String id = sc.nextLine();
        parameter.put("id", id);

        if (exitController.isRight()) {
            parameter.put("id", id);

            return parameter;
        } else {
            return null;
        }
    }

    private static boolean isRight(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("탈퇴할 회원 아이디가 맞습니까? ");
            System.out.print("1.예(Y)      2.아니오(N) : ");
            String answer = sc.nextLine();

        } while (true);
    }

    }



