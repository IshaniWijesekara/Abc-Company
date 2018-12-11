package com.example.demo.controller;

import com.example.demo.dto.ModuleDTO;
import com.example.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveModule(@RequestBody ModuleDTO moduleDTO){
        moduleService.saveModule(moduleDTO);
        return true;
    }

    @GetMapping(value = "/all" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ModuleDTO> getAllModules(){
        return moduleService.getAllModules();
    }
}
