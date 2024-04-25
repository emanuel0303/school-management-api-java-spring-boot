package com.assignment.bootcrud.service.impl;

import com.assignment.bootcrud.dto.StudentDTO;
import com.assignment.bootcrud.entity.Student;
import com.assignment.bootcrud.repository.StudentRepository;
import com.assignment.bootcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);


    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return student;
    }

    @Override
    public void updateStudent(int id, Student student) {
        //check whether student is in database or not
        studentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id " + id));

        student.setId(id);

        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        //check whether ths student in database or not
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id " + id));


        studentRepository.delete(student);
    }

    @Override
    public void updateName(int id, StudentDTO studentDTO) {
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id " + id));

        student.setName(studentDTO.getName());

        studentRepository.save(student);

    }


}
