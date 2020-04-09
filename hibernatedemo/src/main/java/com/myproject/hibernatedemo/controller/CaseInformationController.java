package com.myproject.hibernatedemo.controller;

import com.myproject.hibernatedemo.model.CaseInformation;
import com.myproject.hibernatedemo.service.CaseInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaseInformationController {

    @Autowired
    private CaseInformationService caseInfoService;

    @RequestMapping("/cases")
    public List<CaseInformation> getAllCases(){
        return caseInfoService.getAllCases();
    }

    @RequestMapping("/case/{id}")
    public CaseInformation getCase(@PathVariable String id){
        return caseInfoService.getCaseInformation(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cases")
    public void addCase(@RequestBody CaseInformation caseInfo){
        caseInfoService.addCase(caseInfo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/cases/{id}")
    public void updateCase(@RequestBody CaseInformation caseInfo, @PathVariable String id){
        caseInfoService.updateCase(caseInfo, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cases/{id}")
    public void deleteCase(@PathVariable String id){
        caseInfoService.deleteCase(id);
    }

}
