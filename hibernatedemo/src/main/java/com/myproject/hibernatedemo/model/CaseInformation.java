package com.myproject.hibernatedemo.model;

public class CaseInformation {

    private String caseId;
    private String caseName;
    private String CaseDescription;
    private String entityId;

    public CaseInformation(String caseId, String caseName, String caseDescription, String entityId) {
        this.caseId = caseId;
        this.caseName = caseName;
        CaseDescription = caseDescription;
        this.entityId = entityId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseDescription() {
        return CaseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        CaseDescription = caseDescription;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

}
