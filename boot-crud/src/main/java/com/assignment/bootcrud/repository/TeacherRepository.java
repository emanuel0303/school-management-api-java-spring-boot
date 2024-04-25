package com.assignment.bootcrud.repository;
import com.assignment.bootcrud.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}