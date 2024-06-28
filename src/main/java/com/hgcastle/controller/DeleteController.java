//package com.hgcastle.controller;
//
//import com.hgcastle.dto.MemberDTO;
//import com.hgcastle.service.DeleteService;
//
//import java.util.Map;
//
//public class DeleteController {
//
//    private final DeleteService deleteService;
//    private final PrintResult printResult;
//
//    public DeleteController() {
//        deleteService = new DeleteService();
//        printResult = new PrintResult();
//    }
//
//    public void deleteMember(Map<String,String> parameter){
//
//        String id = parameter.get("id");
//
//        MemberDTO member = deleteService.deleteMember("id");
//    }
//
//}
