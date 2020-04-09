package com.myproject.hibernatedemo.controller;

import com.myproject.hibernatedemo.model.CaseInformation;
import com.myproject.hibernatedemo.model.EntityInformation;
import com.myproject.hibernatedemo.service.EntityInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntityInformationController {

    @Autowired
    private EntityInformationService entityInformationService;

    @RequestMapping("/entities")
    public List<EntityInformation> getAllEntities(){
        return entityInformationService.getAllEntities();
    }

    @RequestMapping("/entity/{id}")
    public EntityInformation getEntity(@PathVariable String id){
        return entityInformationService.getEntity(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/entities")
    public void addEntity(@RequestBody EntityInformation entityInfo){
        entityInformationService.addEntity(entityInfo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/entities/{id}")
    public void updateEntity(@RequestBody EntityInformation entityInfo, @PathVariable String id){
        entityInformationService.updateEntity(entityInfo, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/entity/{id}")
    public void deleteEntity(@PathVariable String id){
        entityInformationService.deleteEntity(id);
    }


}
