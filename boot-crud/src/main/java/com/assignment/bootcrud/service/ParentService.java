package com.assignment.bootcrud.service;

import com.assignment.bootcrud.dto.ParentDTO;
import com.assignment.bootcrud.entity.Parent;

import java.util.List;

/**
 * Service interface for managing Parent entities.
 */
public interface ParentService {

    // Add a new parent
    void addParent(Parent parent);

    // Get all parents
    List<Parent> getParents();

    // Get parent by ID
    Parent getParent(int id);

    // Update parent details by ID
    void updateParent(int id, Parent parent);

    // Delete parent by ID
    void deleteParent(int id);

    // Update parent name by ID
    void updateName(int id, ParentDTO parentDTO);
}
