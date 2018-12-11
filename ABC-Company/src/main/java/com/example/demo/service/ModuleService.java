package com.example.demo.service;

import com.example.demo.dto.ModuleDTO;

import java.util.ArrayList;

public interface ModuleService {

    public boolean saveModule(ModuleDTO moduleDTO);

    public ArrayList<ModuleDTO>getAllModules();

    public ModuleDTO getModuleByName(int moduleId);
}
