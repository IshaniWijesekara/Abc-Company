package com.example.demo.dto;

import com.example.demo.model.Module;

import java.io.Serializable;
import java.util.List;

public class StudentDTO implements Serializable{

    private int studentId;
    private String studentName;
    private String studentAge;
    private List<Module> module;

    public StudentDTO() {
    }

    public StudentDTO(int studentId, String studentName, String studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public StudentDTO(int studentId, String studentName, String studentAge, List<Module> module) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.module = module;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public List<Module> getModule() {
        return module;
    }

    public void setModule(List<Module> module) {
        this.module = module;
    }


}
