package com.myproject.hibernatedemo.model;

public class EntityInformation {

    private String entityId;
    private String entityName;
    private String entityDescription;

    public EntityInformation(String entityId, String entityName, String entityDescription) {
        this.entityId = entityId;
        this.entityName = entityName;
        this.entityDescription = entityDescription;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityDescription() {
        return entityDescription;
    }

    public void setEntityDescription(String entityDescription) {
        this.entityDescription = entityDescription;
    }
}
