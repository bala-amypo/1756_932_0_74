package com.example.demo.entity;

import jakarta.persistence.Entity;

@entity
public class StudentEntity{

    @Id 
    @GeneratedValue(stra)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
}