package com.hgcastle.controller;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.InsertService;
import com.hgcastle.view.InsertResult;

import java.time.LocalDate;
import java.util.Map;

public class InsertController {

    private final InsertService insertService;
    private final InsertResult insertResult;

    public InsertController() {
        insertService = new InsertService();
        insertResult = new InsertResult();
    }

    public String inputID() {
        return insertService.inputId();
    }

    public void insertMember(Map<String, String> parameter) {

        if (parameter != null) {
            String id = parameter.get("id");
            String password = parameter.get("password");
            String name = parameter.get("name");
            String nickname = parameter.get("nickname");
            String hobby = parameter.get("hobby");
            String phone = parameter.get("phone");
            String rrn = parameter.get("rrn");
            String address = parameter.get("address");

            // 입력값을 따로 받지않고 자동으로 설정되는 항목
            String email = id + "@naver.com";
            LocalDate entDate = LocalDate.now();

            MemberDTO newMember = new MemberDTO();
            newMember.setId(id);
            newMember.setPassword(password);
            newMember.setName(name);
            newMember.setNickname(nickname);
            newMember.setHobby(hobby);
            newMember.setPhone(phone);
            newMember.setEmail(email);
            newMember.setRrn(rrn);
            newMember.setAddress(address);
            newMember.setEntDate(entDate);

            if (insertService.insertMember(newMember)) {
                insertResult.printSuccessMessage("insert");
            } else {
                insertResult.printErrorMessage("insert", null);
            }
        }
    }
}
