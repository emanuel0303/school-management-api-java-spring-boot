package com.assignment.bootcrud.service;

import com.assignment.bootcrud.dto.TeacherDTO;
import com.assignment.bootcrud.entity.Teacher;

import java.util.List;

public interface TeacherService {

    // Add a new teacher
    void addTeacher(Teacher teacher);

    // Get all teachers
    List<Teacher> getTeachers();

    // Get teacher by ID
    Teacher getTeacher(int id);

    // Update teacher details by ID
    void updateTeacher(int id, Teacher teacher);

    // Delete teacher by ID
    void deleteTeacher(int id);

    // Update teacher name by ID
    void updateName(int id, TeacherDTO teacherDTO);
}
