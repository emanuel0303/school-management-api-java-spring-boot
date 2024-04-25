package com.assignment.bootcrud.controller;

import com.assignment.bootcrud.dto.StudentDTO;
import com.assignment.bootcrud.entity.Student;
import com.assignment.bootcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add a new student
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student); // Call the method on the instance of StudentService
        return "success add student";
    }

    // Get all students
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // Get student by ID
    @GetMapping("/get")
    public Student getStudent(@RequestParam int id) {
        return studentService.getStudent(id);
    }

    // Update student details by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateStudent(@PathVariable int id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
        return ResponseEntity.noContent().build();
    }

    // Delete student by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    // Update student name by ID
    @PatchMapping("/update-name/{id}")
    public ResponseEntity<Void> updateName(@PathVariable int id, @RequestBody StudentDTO studentDTO) {
        studentService.updateName(id, studentDTO);
        return ResponseEntity.noContent().build();
    }
}
