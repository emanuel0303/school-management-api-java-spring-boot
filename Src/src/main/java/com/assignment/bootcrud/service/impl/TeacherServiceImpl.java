package com.assignment.bootcrud.service.impl;

import com.assignment.bootcrud.dto.TeacherDTO;
import com.assignment.bootcrud.entity.Teacher;
import com.assignment.bootcrud.repository.TeacherRepository;
import com.assignment.bootcrud.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);

    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacher(int id) {
        Teacher teacher = teacherRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Teacher id"+id));
        return teacher;
    }

    @Override
    public void updateTeacher(int id, Teacher teacher) {
        //check whether Teacher is in database or not
        teacherRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Teacher id"+id));

        teacher.setId(id);

        teacherRepository.save(teacher);

    }

    @Override
    public void deleteTeacher(int id) {
        //check whether Teacher is in Database or not
        Teacher teacher = teacherRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Teacher id"+id));

        teacherRepository.delete(teacher);

    }

    @Override
    public void updateName(int id, TeacherDTO teacherDTO) {
        //check whether Teacher is in Database or not
        Teacher teacher = teacherRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Teacher id"+id));

        teacher.setName(teacherDTO.getName());

        teacherRepository.save(teacher);
    }
}
