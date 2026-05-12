package com.example.StudentApi_Task2.Controller;


import com.example.StudentApi_Task2.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    Student student = new Student("John","0901CSE26","Computer Sciecne");

    @GetMapping("/get")
    public ResponseEntity<Student> get_student()
    {
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
