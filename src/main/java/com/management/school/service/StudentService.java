package com.management.school.service;

import com.management.school.database.dao.StudentDao;
import com.management.school.model.Student;

import java.util.List;


public class StudentService {
    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student saveStudent(Student student) {
        return studentDao.save(student);
    }

    public List<Student> getAllStudents() {
        List<Student> studentList = studentDao.findAll();
        return studentList;
    }


}
