package com.management.school.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor_info")
public class Professor {
    @Id
    private int professorId;
    private String professorName;
    private String professorDomain;
}
