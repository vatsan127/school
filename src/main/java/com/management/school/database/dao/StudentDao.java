package com.management.school.database.dao;


import com.management.school.model.Address;
import com.management.school.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface StudentDao {
    Student save(Student student);

    Optional<Student> findById(Long id);

    String convertAddressToJson(Address address);

    List<Student> findAll();

    void deleteById(Long id);

}
