package com.example.demo.service;

import com.example.demo.dto.StudentDTO;

import java.util.ArrayList;

public interface StudentService {

    public boolean saveStudent(StudentDTO studentDTO);

    public ArrayList<StudentDTO> getAllStudents();

    public StudentDTO getStudentById(int StudentId);
}
