package com.management.school.config;

import com.management.school.database.dao.StudentDao;
import com.management.school.database.dao.impl.StudentDaoImpl;
import com.management.school.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class StudentConfig {

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public StudentDao studentDao(JdbcTemplate jdbcTemplate) {
        return new StudentDaoImpl(jdbcTemplate);
    }

    @Bean
    public StudentService studentService(StudentDao studentDao) {
        return new StudentService(studentDao);
    }
}
