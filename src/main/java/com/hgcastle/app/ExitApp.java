package com.hgcastle.app;

import com.hgcastle.common.MemberDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExitApp {

    public static String main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDTO member = new MemberDTO();

        System.out.println("탈퇴할 아이디를 입력하세요 : ");
        String id = sc.nextLine();


        Map<String, MemberDTO> members = new HashMap<>();

        if (id.equals(id)) {
            System.out.println("해당 탈퇴 회원이 맞습니까? (Y/N)");
            String answer = sc.nextLine();

            if (answer.equals("Y")) {
                System.out.println("탈퇴가 왼료 되었습니다.");
            } else if (answer.equals("N")
            }
        }
}


