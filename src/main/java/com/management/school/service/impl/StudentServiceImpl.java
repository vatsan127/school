package com.management.school.service.impl;

import com.management.school.database.dao.StudentDao;
import com.management.school.exception.StudentNotFoundException;
import com.management.school.model.Student;
import com.management.school.service.StudentService;

import java.util.List;
import java.util.Optional;


public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student addstudent(Student student) {
        return studentDao.save(student);
    }

    public Student getStudentsById(Long id) {
        Optional<Student> optionalStudent = studentDao.findById(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            throw new StudentNotFoundException();
        }
    }


    public List<Student> getStudents() {
        List<Student> studentList = studentDao.findAll();
        return studentList;
    }


    public Student removeStudent(Long id) {
        Optional<Student> optionalStudent = studentDao.findById(id);
        if (optionalStudent.isPresent()){
            studentDao.deleteById(id);
        }
        else {
            throw new StudentNotFoundException();
        }
        return optionalStudent.get();
    }
}
