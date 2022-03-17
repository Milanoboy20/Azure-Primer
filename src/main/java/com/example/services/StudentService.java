package com.example.services;

import com.example.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student addStudent(Student student);
    public Optional<Student> getStudentById(int id);
    public Student updateStudent(Student student);
    public void deleteStudent(int id);
    public List<Student> getAllStudents();

}
