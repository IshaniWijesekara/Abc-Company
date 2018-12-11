package com.example.demo.dto;

import com.example.demo.model.Student;

import java.io.Serializable;
import java.util.List;

public class ModuleDTO implements Serializable{
    private int moduleId;
    private String moduleName;
    private List<Student>students;

    public ModuleDTO() {
    }

    public ModuleDTO(int moduleId, String moduleName, List<Student> students) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.students = students;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
