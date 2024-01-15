package com.management.school.constant;

public final class QueryConstants {
    public static final String SELECT_STUDENT = "SELECT * FROM student_info ;";
    public static final String INSERT_STUDENT = "INSERT INTO student_info (name, age, degree, branch, address) VALUES (?,?,?,?,?::json) ;";
    public static final String SELECT_PROFESSOR = "SELECT * FROM professor_info ;";
}
