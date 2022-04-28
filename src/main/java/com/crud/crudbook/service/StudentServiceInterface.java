package com.crud.crudbook.service;

import com.crud.crudbook.entity.Student;

import java.util.List;

public interface StudentServiceInterface {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

}
