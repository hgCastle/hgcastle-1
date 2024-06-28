package com.hgcastle.app;

import com.hgcastle.controller.DeleteController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteApp {
    public static void main(String[] args) {;
        DeleteController deleteController = new DeleteController();

        do {
            System.out.println("=========== 회원 삭제 시스템 =========");
            deleteController.deleteMemberId(inputMemberId());
            break;

        } while (true);
    }

    private static Map<String, String> inputMemberId() {

        Scanner sc = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();

        System.out.println("삭제할 아이디를 입력하세요 : ");
        String id = sc.nextLine();
        parameter.put("id", id);

        return parameter;

    }
}
