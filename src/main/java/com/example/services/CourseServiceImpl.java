package com.example.services;

import com.example.models.Course;
import com.example.repositories.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseRepo courseRepo;

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Optional<Course> getCourseById(int id) {
        return courseRepo.findById(id);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepo.deleteById(id);
    }

    @Override
    public List<Course> allCourses() {
        return (List<Course>) courseRepo.findAll();
    }
}
