package com.example.services;

import com.example.models.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public Optional<Course> getCourseById(int id);
    public void deleteCourse(int id);
    public List<Course> allCourses();
}
