package com.example.StudentApi_Task2.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Student {
    private String name;
    private String id;
    private String department;

    public Student(String name , String id , String department)
    {
        this.name = name;
        this.id = id;
        this.department = department;
    }
}
