package com.hgcastle.controller;


import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.ExitService;

import java.util.Map;

public class ExitController {

    private final PrintResult printResult;
    private final ExitService exitService;


    public ExitController() {
        printResult = new PrintResult();
        exitService = new ExitService();

    }

    public void selectMemberId(Map<String, String> parameter){

        String id = parameter.get("id");

        MemberDTO member = exitService.selectMemberId("id");

        if (id != null){
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectOne");
        }

    }

}
