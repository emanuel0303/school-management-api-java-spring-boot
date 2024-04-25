package com.assignment.bootcrud.repository;

import com.assignment.bootcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Student entities.
 * Extends JpaRepository which provides CRUD operations out of the box.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
