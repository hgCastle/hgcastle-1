package com.hgcastle.controller;



import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.ExitService;
import com.hgcastle.view.ExitResult;

import java.util.Map;

public class ExitController {

    private final ExitService exitService;
    private final ExitResult exitResult;

    public ExitController () {

        exitService = new ExitService();
        exitResult = new ExitResult();
    }

    public void selectMemberId(Map<String, String> parameter){

        String id = parameter.get("id");

        MemberDTO member = exitService.selectMemberId("id");

        if (id != null){
            printResult.printMember(member);

    public void exitMembersById(Map<String, String> parameter) {

        String id = parameter.get("id");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(id);
        if(exitService.exitMembersById(memberDTO)) {
            exitResult.printSuccessMessage("exitMemberSuccess");
        } else {
            exitResult.printErrorMessage("exitMemberFail");
        }

    }

}

    public <__TMP__> __TMP__ selectId() {
    }