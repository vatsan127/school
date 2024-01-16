package com.management.school.database.dao.impl;

import com.management.school.database.dao.StudentDao;
import com.management.school.database.dao.rowmapper.StudentRowMapper;
import com.management.school.exception.StudentNotFoundException;
import com.management.school.model.Address;
import com.management.school.model.Student;
import jakarta.transaction.Transactional;
import org.json.JSONObject;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

import static com.management.school.constant.QueryConstants.*;

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
                student.getBranch(), convertAddressToJson(student.getAddress()));
        return student;
    }

    @Override
    public String convertAddressToJson(Address address) {
        JSONObject addressJson = new JSONObject();
        addressJson.put("city", address.getCity());
        addressJson.put("state", address.getState());
        return addressJson.toString();
    }

    @Override
    public Optional<Student> findById(Long id) {
        try {
            Student student = jdbcTemplate.queryForObject(SELECT_STUDENT_BY_ID, new StudentRowMapper(), id);
            return Optional.of(student);
        } catch (IncorrectResultSizeDataAccessException e) {
            throw new StudentNotFoundException();
        }
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = jdbcTemplate.query(SELECT_STUDENT,
                new StudentRowMapper());
        return studentList;
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update(DELETE_STUDENT, id);
    }
}
