package com.myproject.hibernatedemo.service;

import com.myproject.hibernatedemo.model.CaseInformation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CaseInformationService {

    private List<CaseInformation> caseList = new ArrayList<CaseInformation>();

    public List<CaseInformation> getAllCases(){
        return caseList;
    }
    public CaseInformation getCaseInformation(String id){
        return caseList.stream().filter(t -> t.getCaseId().equals(id)).findFirst().get();
    }

    public void addCase(CaseInformation caseInfo){
        caseList.add(caseInfo);
    }

    public void updateCase(CaseInformation caseInfo, String id){
        for(int i=0; i<caseList.size();i++){
            CaseInformation updateCaseInfo = caseList.get(i);
            if(updateCaseInfo.getCaseId().equals(caseInfo.getCaseId())){
                caseList.set(i,caseInfo);
                return;
            }
        }
    }

    public void deleteCase(String id){
        caseList.removeIf(c -> c.getCaseId().equals(id));
    }
}
