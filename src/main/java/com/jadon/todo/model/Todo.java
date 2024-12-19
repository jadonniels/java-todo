package com.jadon.todo.model;

import jakarta.persistence.*;

// Lombok takes care boilerplate with Constructor and Get/Set annotations
// Entity and Table are for JPA
@Entity
@Table(name = "todos")

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;
}