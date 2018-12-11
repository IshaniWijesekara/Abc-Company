package com.example.demo.model;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int StudentId;
    private String studentName;
    private String studentAge;

    @OneToMany(cascade = CascadeType.ALL)
    private Module module;

    public Student() {
    }

    public Student(int StudentId ,String studentName, String studentAge) {
        this.StudentId = StudentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Student(String studentName, String studentAge, Module module) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.module = module;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
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

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", module=" + module +
                '}';
    }
}
