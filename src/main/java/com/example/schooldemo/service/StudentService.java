package com.example.schooldemo.service;

import com.example.schooldemo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    void saveStudent(Student student);
    Student getStudentById(long id);

    void deleteStudentById(long id);

}
