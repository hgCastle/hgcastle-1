package com.hgcastle.controller;

import com.hgcastle.service.LoginService;
import com.hgcastle.view.LoginResult;

import java.util.Scanner;

public class LoginController {

    private final LoginResult loginResult;
    private final LoginService loginService;

    public LoginController() {
        loginResult = new LoginResult();
        loginService = new LoginService();
    }

    public boolean login() {

        String id = inputId();
        String password = inputPassword();

        do {
            if (loginService.login(id, password)) {
                loginResult.printSuccessMessage("login");
                return true;
            } else {
                do {
                    loginResult.printErrorMessage("wrongPassword");
                    System.out.println();
                    return false;
                } while (true);
            }
        } while (true);
    }

    public String inputId() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            if (id.isBlank()) {
                loginResult.printErrorMessage("blank");
                System.out.println();
            } else {
                if (loginService.isItExistId(id)) {
                    return id;
                } else {
                    loginResult.printErrorMessage("noneExistId");
                    System.out.println();
                }
            }
        } while (true);
    }

    public String inputPassword() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();
            if (password.isBlank()) {
                loginResult.printErrorMessage("blank");
                System.out.println();
            } else {
                return password;
            }
        } while (true);
    }
}
