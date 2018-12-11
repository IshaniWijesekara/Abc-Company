package com.example.demo.service.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean saveStudent(StudentDTO studentDTO) {
        Student student = new Student(studentDTO.getStudentId(), studentDTO.getStudentName(), studentDTO.getStudentAge());
        studentRepository.save(student);
        return true;
    }

    @Override
    public ArrayList<StudentDTO> getAllStudents() {
        List<StudentDTO> allStudent = new ArrayList<>();
        for (Student student : studentRepository.findAll()) {
            StudentDTO customerDTO = new StudentDTO(student.getStudentId(),
                    student.getStudentName(),
                    student.getStudentAge());
            allStudent.add(customerDTO);
        }
        return (ArrayList<StudentDTO>) allStudent;
    }

    @Override
    public StudentDTO getStudentById(int StudentId) {
        Student student = studentRepository.findById(StudentId).get();
        StudentDTO studentDTO = new StudentDTO(student.getStudentId(), student.getStudentName() , student.getStudentAge());
        return studentDTO;
    }
}
