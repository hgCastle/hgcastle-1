package com.hgcastle.controller;

import com.hgcastle.service.DeleteService;
import com.hgcastle.view.DeleteResult;

import java.util.Map;

public class DeleteController {

    private final DeleteService deleteService;
    private final DeleteResult deleteResult;

    public DeleteController() {

        deleteService = new DeleteService();
        deleteResult = new DeleteResult();
    }

    public void deleteMemberId(Map<String, String> parameter){

        String id = parameter.get("id");

        if (deleteService.deleteMemberId(id)){
            deleteResult.printSuccessMessage("delete");
        } else {
            deleteResult.printErrorMessage("delete");
        }
    }

}
