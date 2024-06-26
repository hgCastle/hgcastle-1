package com.hgcastle.app;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.ExitService;

import java.util.Scanner;

public class ExitApp {
    public static void main(String[] args) {

        ExitService exitService = new ExitService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("탈퇴할 아이디를 입력해주세요 : ");
        String id = scanner.nextLine();

        exitService.selectId(id);

    }
}


