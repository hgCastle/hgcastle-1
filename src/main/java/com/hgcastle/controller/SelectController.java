package com.hgcastle.controller;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.SelectService;
import com.hgcastle.view.SelectResult;

import java.util.Map;

public class SelectController {

    private final SelectService selectService;
    private final SelectResult selectResult;


    public SelectController() {
        selectService = new SelectService();
        selectResult = new SelectResult();
    }

    public void viewMembersById(Map<String, String> parameter) {

        String id = parameter.get("id");

        MemberDTO member = selectService.viewMembersById(id);

        if(member != null) {
            selectResult.printMember(member);
        } else {
            selectResult.printErrorMessage("viewIdFail");
        }

    }

    public void viewMembersByName(Map<String, String> parameter) {

        String name = parameter.get("name");

        MemberDTO member = selectService.viewMembersByName(name);

        if(member != null) {
            selectResult.printMember(member);
        } else {
            selectResult.printErrorMessage("viewNameFail");
        }
    }
}
