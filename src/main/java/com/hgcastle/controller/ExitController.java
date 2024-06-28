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
        } while (true);
    }

    public boolean isItRight() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("이대로 등록을 진행하시겠습니까?");
            System.out.print("1.예(Y)      2.아니오(N) : ");
            String answer = sc.nextLine();
            if (answer.equals("예") || answer.equals("Y") || answer.equals("y") || answer.equals("1")
                    || answer.equals("네") || answer.equals("ㅇ") || answer.equals("ㅇㅇ") || answer.equals("ㄱㄱ")
                    || answer.equals("ㄱ") || answer.equals("응") || answer.equals("어") || answer.equals("웅")) {
                return true;
            } else if (answer.equals("아니오") || answer.equals("N") || answer.equals("n") || answer.equals("2")
                    || answer.equals("아니요") || answer.equals("ㄴ") || answer.equals("ㄴㄴ") || answer.equals("놉")
                    || answer.equals("노") || answer.equals("시러")) {
                return false;
            } else {
                exitResult.printErrorMessage("wron");
                System.out.println();
            }
        } while (true);

}

}