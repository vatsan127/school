package com.management.school.database.dao.rowmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.management.school.model.Address;
import com.management.school.model.Student;
import org.postgresql.util.PGobject;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getLong("age"));
        student.setBranch(rs.getString("branch"));
        student.setDegree(rs.getString("degree"));
        ObjectMapper mapper = new ObjectMapper();
        PGobject pGobject = (PGobject) rs.getObject("address");
        try {
            Address studentAddress = mapper.readValue(pGobject.getValue(), Address.class);
            student.setAddress(studentAddress);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return student;
    }
}
