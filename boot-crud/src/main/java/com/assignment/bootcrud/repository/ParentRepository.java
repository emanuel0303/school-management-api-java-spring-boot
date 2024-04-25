package com.assignment.bootcrud.repository;

import com.assignment.bootcrud.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Parent entities.
 * Extends JpaRepository which provides CRUD operations out of the box.
 */
public interface ParentRepository extends JpaRepository<Parent, Integer> {
}
