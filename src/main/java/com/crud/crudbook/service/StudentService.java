package com.crud.crudbook.service;

import com.crud.crudbook.entity.Student;
import com.crud.crudbook.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {return studentRepository.findAll();}

    @Override
    public Student saveStudent(Student student) {return studentRepository.save(student);}

    @Override
    public Student updateStudent(Student student) {return studentRepository.save(student);}

    @Override
    public void deleteStudent(Long id) {studentRepository.deleteById(id);}
}
