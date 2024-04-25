package com.assignment.bootcrud.service.impl;

import com.assignment.bootcrud.dto.ParentDTO;
import com.assignment.bootcrud.entity.Parent;
import com.assignment.bootcrud.repository.ParentRepository;
import com.assignment.bootcrud.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    // Add a new parent
    @Override
    public void addParent(Parent parent) {
        parentRepository.save(parent);
    }

    // Get all parents
    @Override
    public List<Parent> getParents() {
        return parentRepository.findAll();
    }

    // Get parent by ID
    @Override
    public Parent getParent(int id) {
        Parent parent = parentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Parent id" + id));
        return parent;
    }

    // Update parent details by ID
    @Override
    public void updateParent(int id, Parent parent) {
        // Check whether parent is in the database or not
        parentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Parent id " + id));

        parent.setId(id);
        parentRepository.save(parent);
    }

    // Delete parent by ID
    @Override
    public void deleteParent(int id) {
        // Check whether the parent is in the database or not
        Parent parent = parentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Parent id " + id));

        parentRepository.delete(parent);
    }

    // Update parent name by ID
    @Override
    public void updateName(int id, ParentDTO parentDTO) {
        // Check whether the parent is in the database or not
        Parent parent = parentRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Parent id " + id));

        // Update the name of the parent
        parent.setName(parentDTO.getName());
        parentRepository.save(parent);
    }
}
