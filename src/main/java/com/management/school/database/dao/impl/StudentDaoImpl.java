package com.management.school.database.dao.impl;

import com.management.school.database.dao.StudentDao;
import com.management.school.database.dao.rowmapper.StudentRowMapper;
import com.management.school.model.Address;
import com.management.school.model.Student;
import jakarta.transaction.Transactional;
import org.json.JSONObject;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static com.management.school.constant.QueryConstants.INSERT_STUDENT;
import static com.management.school.constant.QueryConstants.SELECT_STUDENT;

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

    private String convertAddressToJson(Address address) {
        JSONObject addressJson = new JSONObject();
        addressJson.put("city", address.getCity());
        addressJson.put("state", address.getState());
        return addressJson.toString();
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = jdbcTemplate.query(SELECT_STUDENT,
                new StudentRowMapper());
        System.out.println(studentList);
        return studentList;
    }

    @Override
    public void deleteById(Long id) {

    }
}
