package com.management.school.service;

import com.management.school.database.dao.StudentDao;
import com.management.school.exception.StudentNotFoundException;
import com.management.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student saveStudent(Student student) {
        return studentDao.save(student);
    }

    public List<Student> getAllStudents() {
        Optional<List<Student>> optionalStudentList = studentDao.findAll();
        if(optionalStudentList.isPresent()) {
            return optionalStudentList.get();
        }
        throw new StudentNotFoundException();
    }

}
