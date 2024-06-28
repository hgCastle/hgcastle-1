package com.hgcastle.controller;


import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.ExitService;
import com.hgcastle.view.ExitResult;

import java.util.Map;

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
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }
}