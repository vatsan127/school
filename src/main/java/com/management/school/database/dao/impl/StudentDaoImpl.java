package com.management.school.database.dao.impl;

import com.management.school.database.dao.StudentDao;
import com.management.school.database.dao.rowmapper.StudentRowMapper;
import com.management.school.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.management.school.constant.QueryConstants.*;

@Repository

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Transactional
    @Override
    public Student save(Student student) {
        jdbcTemplate.update(INSERT_STUDENT,
                student.getName(), student.getAge(), student.getDegree(),
                student.getBranch(), student.getAddress().toString());
        return student;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public Optional<List<Student>> findAll() {
        List<Student> studentList = jdbcTemplate.query(SELECT_STUDENT,
                new StudentRowMapper());
        return Optional.ofNullable(studentList);
    }

    @Override
    public void deleteById(Long id) {

    }
}
