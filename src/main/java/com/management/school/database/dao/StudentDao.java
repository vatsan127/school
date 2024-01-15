package com.management.school.database.dao;


import com.management.school.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface StudentDao {
    Student save(Student student);

    Student findById(Long id);

    List<Student> findAll();

    void deleteById(Long id);

}
