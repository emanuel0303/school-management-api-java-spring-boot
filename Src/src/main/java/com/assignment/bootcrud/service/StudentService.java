package com.assignment.bootcrud.service;

import com.assignment.bootcrud.dto.StudentDTO;
import com.assignment.bootcrud.entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List<Student> getStudents();

    Student getStudent(int id);

    void updateStudent(int id, Student student);

    void deleteStudent(int id);

    void updateName(int id, StudentDTO studentDTO);


}
