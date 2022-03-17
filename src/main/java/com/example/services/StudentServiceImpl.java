package com.example.services;

import com.example.models.Student;
import com.example.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;


    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepo.findById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }
}
