package com.hgcastle.controller;

import com.hgcastle.dto.MemberDTO;
import com.hgcastle.service.DeleteService;
import com.hgcastle.view.DeleteResult;

import java.util.Map;

public class DeleteController {

    private final DeleteService deleteService;
    private final DeleteResult deleteResult;

    public DeleteController () {
        deleteService = new DeleteService();
        deleteResult = new DeleteResult();
    }


    public void deleteMembersById(Map<String, String> parameter) {

        String id = parameter.get("id");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(id);
        if(deleteService.deleteMembersById(memberDTO)) {
            deleteResult.printSuccessMessage("deleteMemberSuccess");
        } else {
            deleteResult.printErrorMessage("deleteMemberFail");
        }


    }

}
