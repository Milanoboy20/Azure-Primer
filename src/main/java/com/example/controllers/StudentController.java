package com.example.controllers;

import com.example.models.Student;
import com.example.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping(value = "/students", consumes = "application/json", produces = "application/json")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping(value = "/students", consumes = "application/json", produces = "application/json")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @GetMapping("/students")
    public List<Student> allStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(Integer.parseInt(id));
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable String id){
        return studentService.getStudentById(Integer.parseInt(id));
    }
}
