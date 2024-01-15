package com.management.school.controller;

import com.management.school.model.Student;
import com.management.school.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createNewStudents(@Valid @RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/id")
                .buildAndExpand(savedStudent.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

}
