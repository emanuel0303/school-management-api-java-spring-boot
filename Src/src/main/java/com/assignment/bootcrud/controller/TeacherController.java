package com.assignment.bootcrud.controller;

import com.assignment.bootcrud.dto.TeacherDTO;
import com.assignment.bootcrud.entity.Teacher;
import com.assignment.bootcrud.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Add a new teacher
    @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
        return "success add teacher";
    }

    // Get all teachers
    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    // Get teacher by ID
    @GetMapping("/get")
    public Teacher getTeacher(@RequestParam int id) {
        return teacherService.getTeacher(id);
    }

    // Update teacher details by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateTeacher(@PathVariable int id, @RequestBody Teacher teacher) {
        teacherService.updateTeacher(id, teacher);
        return ResponseEntity.noContent().build();
    }

    // Delete teacher by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable int id) {
        teacherService.deleteTeacher(id);
        return ResponseEntity.noContent().build();
    }

    // Update teacher name by ID
    @PatchMapping("/update-name/{id}")
    public ResponseEntity<Void> updateName(@PathVariable int id, @RequestBody TeacherDTO teacherDTO) {
        teacherService.updateName(id, teacherDTO);
        return ResponseEntity.noContent().build();
    }
}
