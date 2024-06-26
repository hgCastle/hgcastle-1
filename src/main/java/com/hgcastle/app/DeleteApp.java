package com.hgcastle.app;

import com.hgcastle.controller.DeleteController;

import java.util.Scanner;

public class DeleteApp {

    Scanner sc = new Scanner(System.in);
    DeleteController deleteController = new DeleteController();

    do

    {
        System.out.println("삭제할 회원 아이디를 입력하세요 : ");
        String id = sc.nextLine();

        switch (id) {
            case "":
                deleteController.deleteMember(inputMemberId());
        }
    }

}
