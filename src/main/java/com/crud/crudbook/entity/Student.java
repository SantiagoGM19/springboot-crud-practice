package com.crud.crudbook.entity;


import lombok.Data;

import javax.persistence.*;

@Entity(name = "Student")
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private Integer numberSubjectsEnrolled;

}
