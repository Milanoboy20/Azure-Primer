package com.example.services;


import com.example.models.Faculty;
import com.example.repositories.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService{

    @Autowired
    FacultyRepo facultyRepo;


    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    @Override
    public Optional<Faculty> getFacultyById(int id) {
        return facultyRepo.findById(id);
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    @Override
    public void deleteFaculty(int id) {
        facultyRepo.deleteById(id);
    }

    @Override
    public List<Faculty> getAllFaculty() {
        return (List<Faculty>) facultyRepo.findAll();
    }
}
