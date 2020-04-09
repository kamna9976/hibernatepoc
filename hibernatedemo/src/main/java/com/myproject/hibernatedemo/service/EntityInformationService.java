package com.myproject.hibernatedemo.service;

import com.myproject.hibernatedemo.model.EntityInformation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntityInformationService {
    private List<EntityInformation> entityList = new ArrayList<EntityInformation>();

    public List<EntityInformation> getAllEntities(){
        return entityList;
    }
    public EntityInformation getEntity(String id){
        return entityList.stream().filter(t -> t.getEntityId().equals(id)).findFirst().get();
    }

    public void addEntity(EntityInformation entity){
        entityList.add(entity);
    }

    public void updateEntity(EntityInformation entityInfo, String id){
        for(int i=0; i<entityList.size();i++){
            EntityInformation updateEntityInfo = entityList.get(i);
            if(updateEntityInfo.getEntityId().equals(entityInfo.getEntityId())){
                entityList.set(i,entityInfo);
                return;
            }
        }
    }

    public void deleteEntity(String id){
        entityList.removeIf(e -> e.getEntityId().equals(id));
    }
}
