package com.example.services;

import com.example.models.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {

    public Faculty addFaculty(Faculty faculty);
    public Optional<Faculty> getFacultyById(int id);
    public Faculty updateFaculty(Faculty faculty);
    public void deleteFaculty(int id);
    public List<Faculty> getAllFaculty();
}
