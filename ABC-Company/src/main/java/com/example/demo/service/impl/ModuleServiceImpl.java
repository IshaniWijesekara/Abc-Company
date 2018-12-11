package com.example.demo.service.impl;

import com.example.demo.dto.ModuleDTO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Module;
import com.example.demo.model.Student;
import com.example.demo.repo.ModuleRepository;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean saveModule(ModuleDTO moduleDTO) {
        return false;

    }

    @Override
    public ArrayList<ModuleDTO> getAllModules() {
        return null;
    }

    @Override
    public ModuleDTO getModuleByName(int moduleId) {
        Module module = moduleRepository.findById(moduleId).get();
        ModuleDTO moduleDTO = new ModuleDTO(module.getModuleId() , module.getModuleName() , module.getStudents());
        return moduleDTO;
    }
}
