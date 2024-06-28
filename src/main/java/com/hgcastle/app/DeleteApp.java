package com.hgcastle.app;

import com.hgcastle.controller.DeleteController;

import java.util.Scanner;

public class DeleteApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DeleteController deleteController = new DeleteController();

        do {
            System.out.println("삭제할 회원 아이디를 입력하세요 : ");
            String id = sc.nextLine();

            switch (id){
                case "1": deleteController.deleteMember(inputMemberId()); break;
            }
        } while (true);
    }

}
