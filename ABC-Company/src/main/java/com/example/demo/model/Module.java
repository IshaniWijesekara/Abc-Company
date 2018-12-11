package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ModuleId;
    private String moduleName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student>students;

    public Module() {
    }

    public Module(int ModuleId , String moduleName, List<Student> students) {
        this.ModuleId = ModuleId;
        this.moduleName = moduleName;
        this.students = students;
    }

    public Module(String moduleName, List<Student> students) {
        this.moduleName = moduleName;
        this.students = students;
    }

    public int getModuleId() {
        return ModuleId;
    }

    public void setModuleId(int moduleId) {
        ModuleId = moduleId;
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

    @Override
    public String toString() {
        return "Module{" +
                "ModuleId=" + ModuleId +
                ", moduleName='" + moduleName + '\'' +
                ", students=" + students +
                '}';
    }

}
