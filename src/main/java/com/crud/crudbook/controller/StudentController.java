package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Student;
import com.crud.crudbook.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("api/v2/")
public class StudentController {

    @Autowired
    StudentServiceInterface studentServiceInterface;

    @GetMapping("get/students")
    public List<Student> getAllStudents(){
        return studentServiceInterface.getAllStudents();
    }

    @PostMapping("save/student")
    public Student saveStudent(@RequestBody Student student){
        return studentServiceInterface.saveStudent(student);
    }

    @PutMapping("update/student")
    public Student updateStudent(@RequestBody Student student){
        return studentServiceInterface.updateStudent(student);
    }

    @DeleteMapping("delete/student/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentServiceInterface.deleteStudent(id);
    }

}
