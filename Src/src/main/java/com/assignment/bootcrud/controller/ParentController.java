package com.assignment.bootcrud.controller;

import com.assignment.bootcrud.dto.ParentDTO;
import com.assignment.bootcrud.entity.Parent;
import com.assignment.bootcrud.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    // Add a new parent
    @PostMapping("/add")
    public String addParent(@RequestBody Parent parent) {
        parentService.addParent(parent);
        return "success add parent";
    }

    // Get all parents
    @GetMapping
    public List<Parent> getParents() {
        return parentService.getParents();
    }

    // Get parent by ID
    @GetMapping("/get")
    public Parent getParent(@RequestParam int id) {
        return parentService.getParent(id);
    }

    // Update parent details by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateParent(@PathVariable int id, @RequestBody Parent parent) {
        parentService.updateParent(id, parent);
        return ResponseEntity.noContent().build();
    }

    // Delete parent by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteParent(@PathVariable int id) {
        parentService.deleteParent(id);
        return ResponseEntity.noContent().build();
    }

    // Update parent name by ID
    @PatchMapping("/update-name/{id}")
    public ResponseEntity<Void> updateName(@PathVariable int id, @RequestBody ParentDTO parentDTO) {
        parentService.updateName(id, parentDTO);
        return ResponseEntity.noContent().build();
    }
}
