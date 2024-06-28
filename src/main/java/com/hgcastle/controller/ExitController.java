package com.hgcastle.controller;


import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.ExitService;
import com.hgcastle.view.ExitResult;

import java.util.Map;
import java.util.Scanner;

public class ExitController {

    private final ExitService exitService;
    private final ExitResult exitResult;

    public ExitController() {

        exitService = new ExitService();
        exitResult = new ExitResult();

    }

    public void selectMemberId(Map<String, String> parameter) {

        String id = parameter.get("id");

        MemberDTO member = exitService.selectMemberId(id);

        if (member != null) {
            exitResult.printMemberId(member);
        } else {
            exitResult.printErrorMessage("selectOne");
        }
    }

    public boolean isRight() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("해당 Id가 탈퇴할 회원이 맞습니까? ");
            System.out.print("Y/N");
            String answer = sc.nextLine();

            if (answer.equals("Y"))
                return true;

        }
    }
}