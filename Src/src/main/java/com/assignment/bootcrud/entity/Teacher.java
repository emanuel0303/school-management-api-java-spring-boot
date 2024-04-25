package com.assignment.bootcrud.entity;

import jakarta.persistence.Entity; // Annotation to indicate that this class is a JPA entity
import jakarta.persistence.GeneratedValue; // Annotation to specify automatic generation of primary key values
import jakarta.persistence.Id; // Annotation to specify the primary key
import lombok.*; // Lombok annotations for generating boilerplate code

@Data // Lombok annotation to generate getters, setters, toString, hashCode, and equals methods
@Entity // JPA annotation to indicate that this class is a JPA entity and should be mapped to a database table
@NoArgsConstructor // Lombok annotation to generate a no-args constructor
@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
public class Teacher {

    @Id // JPA annotation to specify the primary key
    @GeneratedValue // JPA annotation to specify automatic generation of primary key values
    private Integer id; // Primary key field

    private String name; // Name of the teacher
    private Integer age; // Age of the teacher
    private String address; // Address of the teacher
}
