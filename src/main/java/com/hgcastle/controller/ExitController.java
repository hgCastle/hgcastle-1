package com.hgcastle.controller;


import com.hgcastle.service.ExitService;

import java.util.Map;

public class ExitController {

    private final ExitService exitService;
    public final PrintResult printResult;

    public ExitController() {
        exitService = new ExitService();
        printResult = new PrintResult();

    }

    public void selectId(Map<String, String> parameter){

        String id = parameter.get("id");

        exitService.selectId(id);

        if (id != null){
            printResult.printId(id);
        } else {
            printResult.printId(id);
        }
    }

}
