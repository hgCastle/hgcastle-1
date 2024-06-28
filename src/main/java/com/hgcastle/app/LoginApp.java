package com.hgcastle.app;

import com.hgcastle.controller.LoginController;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n====== 로그인 기능 ======");
            loginController.login();
        } while (true);
    }
}
