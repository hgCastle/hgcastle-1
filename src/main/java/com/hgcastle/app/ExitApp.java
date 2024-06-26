package com.hgcastle.app;

import com.hgcastle.common.MemberDTO;

import java.lang.reflect.Member;
import java.util.Scanner;

public class ExitApp {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDTO member = new MemberDTO();

        do {
            System.out.println("탈퇴할 회원 아이디를 입력하세요 : ");
            String id = sc.nextLine();
            sc.nextLine();

            member.modifyid(inputmodifyid()); break;

        } while (true);
    }

    private static Member inputmodifyid() {

        Scanner sc = new Scanner(System.in);

    }

}
